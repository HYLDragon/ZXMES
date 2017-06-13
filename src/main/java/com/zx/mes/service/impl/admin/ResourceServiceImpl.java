package com.zx.mes.service.impl.admin;

import com.zx.mes.dao.admin.ResourceMapper;
import com.zx.mes.dao.admin.ResourceTypeMapper;
import com.zx.mes.dao.admin.UserMapper;
import com.zx.mes.model.admin.Resource;
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
                r.setPid(t.getPid());
                r.setPid(resourceDao.selectByPrimaryKey(r.getPid()).getName());
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

    }

    public void delete(String id) {

    }

    public void edit(Presource resource) {

    }

    public Presource get(String id) {
        return null;
    }
}