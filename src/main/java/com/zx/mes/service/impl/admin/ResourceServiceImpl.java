package com.zx.mes.service.impl.admin;

import com.zx.mes.dao.admin.ResourceMapper;
import com.zx.mes.dao.admin.ResourceTypeMapper;
import com.zx.mes.dao.admin.RoleResourceMapper;
import com.zx.mes.dao.admin.UserMapper;
import com.zx.mes.model.admin.Resource;
import com.zx.mes.model.admin.RoleResourceKey;
import com.zx.mes.pageModel.Presource;
import com.zx.mes.pageModel.SessionInfo;
import com.zx.mes.pageModel.Tree;

import com.zx.mes.service.admin.ResourceServiceI;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hyl on 17/6/12.
 */
@Service
public class ResourceServiceImpl implements ResourceServiceI {


    @Autowired
    private ResourceMapper resourceDao;

    @Autowired
    private ResourceTypeMapper resourceTypeDao;

    @Autowired
    private RoleResourceMapper roleResourceMapper;

    @Autowired
    private UserMapper userDao;
    public List<Tree> tree(SessionInfo sessionInfo) {
        List<Resource> l = null;
        List<Tree> lt = new ArrayList<Tree>();
        Resource resource=new Resource();
        resource.setTresourcetypeId("0");
        if (sessionInfo != null) {
            resource.setUserId(sessionInfo.getId());
            l=resourceDao.getResourceWithTypeUser(resource);
        }else {
            l=resourceDao.getResourceWithType(resource);
        }
        if (l != null && l.size() > 0) {
            for (Resource r : l) {
                Tree tree = new Tree();
                BeanUtils.copyProperties(r, tree);

                tree.setText(r.getName());
                tree.setIconCls(r.getIcon());
                Map<String, Object> attr = new HashMap<String, Object>();
                attr.put("url", r.getUrl());
                tree.setAttributes(attr);
                lt.add(tree);
            }
        }
        return lt;
    }

    public List<Tree> allTree(SessionInfo sessionInfo) {
        List<Resource> l = null;
        List<Tree> lt = new ArrayList<Tree>();
        Resource resource=new Resource();

        if (sessionInfo != null) {
            resource.setUserId(sessionInfo.getId());
            l=resourceDao.getResourceWithTypeUser(resource);
        }else {
            l=resourceDao.getResourceWithType(resource);
        }
        if (l != null && l.size() > 0) {
            for (Resource r : l) {
                Tree tree = new Tree();
                BeanUtils.copyProperties(r, tree);

                tree.setText(r.getName());
                tree.setIconCls(r.getIcon());
                Map<String, Object> attr = new HashMap<String, Object>();
                attr.put("url", r.getUrl());
                tree.setAttributes(attr);

                lt.add(tree);
            }
        }
        return lt;
    }

    public List<Presource> treeGrid(SessionInfo sessionInfo) {
        List<Resource> l = null;
        List<Presource> lr = new ArrayList<Presource>();
        Resource resource=new Resource();
        if (sessionInfo != null) {
            resource.setUserId(sessionInfo.getId());
            l=resourceDao.getResourceWithTypeUser(resource);// 自查自己有权限的资源
        }else {
            l=resourceDao.getResourceWithType(resource);
        }
            if (l != null && l.size() > 0) {
            for (Resource t : l) {
                Presource r = new Presource();
                BeanUtils.copyProperties(t, r);
                if(t.getPid()!=null && t.getPid() !=""){
                    r.setPid(t.getPid());
                    r.setName(resourceDao.selectByPrimaryKey(r.getPid()).getName());
                }

                r.setTypeId(t.getTresourcetypeId());
                r.setTypeName(t.getResourcetype().getName());
                if (t.getIcon() != null && !t.getIcon().equalsIgnoreCase("")) {
                    r.setIconCls(t.getIcon());
                }
                lr.add(r);
            }
        }

        return lr;
    }

    public void add(Presource resource, SessionInfo sessionInfo) {
        Resource t = new Resource();
        BeanUtils.copyProperties(resource, t);
        resourceDao.insertSelective(t);
    }

    public void delete(String id) {
        Resource resource=resourceDao.selectByPrimaryKey(id);
        del(resource);
    }

    private void del(Resource resource) {
        Resource resource2=new Resource();
        resource2.setId(resource.getPid());
        List<Resource> resourceList=resourceDao.getAll(resource2);

        if(resourceList !=null && resourceList.size()>0){
            for(int i=0;i<resourceList.size();i++){
                del(resourceList.get(i));
            }
        }
        //删除中间表
        RoleResourceKey roleResourceKey=new RoleResourceKey();
        roleResourceKey.setTresourceId(resource.getId());
        roleResourceMapper.deleteByPrimaryRoleResourceKey(roleResourceKey);

        //删除resource表中记录
        resourceDao.deleteByPrimaryKey(resource.getId());
    }

    public void edit(Presource resource) {
        Resource resource2=new Resource();
        BeanUtils.copyProperties(resource,resource2);
        if(resource.getIconCls() !=null && !resource.getIconCls().equalsIgnoreCase("")){
            resource2.setIcon(resource.getIconCls());
        }
        if (resource.getTypeId() != null && !resource.getTypeId().equalsIgnoreCase("")) {
            resource2.setPid(resource.getTypeId());// 赋值资源类型
        }
        resourceDao.insertSelective(resource2);
    }

    public Presource get(String id) {
        Resource resource=new Resource();
        resource.setId(id);
        Resource t = resourceDao.getResourceWithType(resource).get(0);
        Presource r = new Presource();
        BeanUtils.copyProperties(t, r);

        r.setPid(t.getPid());
        r.setPname(resourceDao.selectByPrimaryKey(r.getPid()).getName());

        r.setTypeId(t.getTresourcetypeId());
        r.setTypeName(resourceTypeDao.selectByPrimaryKey(r.getTypeId()).getName());
        if (t.getIcon() != null && !t.getIcon().equalsIgnoreCase("")) {
            r.setIconCls(t.getIcon());
        }
        return r;
    }
}