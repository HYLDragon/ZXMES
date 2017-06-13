package com.zx.mes.service.impl.admin;

import com.zx.mes.dao.admin.*;
import com.zx.mes.model.admin.Resource;
import com.zx.mes.model.admin.Role;
import com.zx.mes.model.admin.RoleResourceKey;
import com.zx.mes.model.admin.UserRoleKey;
import com.zx.mes.pageModel.Prole;
import com.zx.mes.pageModel.SessionInfo;
import com.zx.mes.pageModel.Tree;
import com.zx.mes.service.admin.RoleServiceI;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/13.
 */
public class RoleServiceImpl implements RoleServiceI {

    @Autowired
    private RoleMapper roleDao;

    @Autowired
    private UserMapper userDao;

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private ResourceMapper resourceDao;

    @Autowired
    private RoleResourceMapper roleResourceMapper;


    @Override
    public void add(Prole role, SessionInfo sessionInfo) {
        Role t = new Role();
        UserRoleKey userRoleKey=new UserRoleKey();
        BeanUtils.copyProperties(role, t);
        if (role.getPid() != null && !role.getPid().equalsIgnoreCase("")) {
            t.setPid(role.getPid());
        }
        roleDao.insert(t);

        // 刚刚添加的角色，赋予给当前的用户
        userRoleKey.setTroleId(role.getId());
        userRoleKey.setTuserId(sessionInfo.getId());
        userRoleMapper.insert(userRoleKey);
    }

    @Override
    public Prole get(String id) {
        Prole r = new Prole();
        Role role=new Role();
        role.setId(id);
        List<Role> list = roleDao.getAllWithRource(role);
        if (list != null && list.size()>0){
            StringBuilder ids=new StringBuilder();
            StringBuilder names=new StringBuilder();
            boolean b = false;
            Role role1=list.get(0);
            for(int i=0;i<role1.getResources().size();i++){
                Resource resource=role1.getResources().get(i);

                if(b){
                    ids.append(",");
                    names.append(",");
                }else{
                    b=true;
                }
                ids.append(resource.getId());
                names.append(resource.getName());
            }
            r.setResourceIds(ids.toString());
            r.setResourceNames(names.toString());
        }
        return r;
    }

    @Override
    public void edit(Prole role) {
        Role t = roleDao.selectByPrimaryKey(role.getId());
        if (t != null) {
            BeanUtils.copyProperties(role, t);
            if (role.getPid() != null && !role.getPid().equalsIgnoreCase("")) {
                roleDao.updateByPrimaryKeySelective(t);
            }

        }
    }

    @Override
    public List<Prole> treeGrid(SessionInfo sessionInfo) {
        List<Prole> rl = new ArrayList<Prole>();
        List<Role> tl = null;
        Role role1=new Role();
        if (sessionInfo != null) {
            //params.put("userId", sessionInfo.getId());// 查自己有权限的角色
            role1.setId(sessionInfo.getId());
            tl = roleDao.getAllWithRource(role1);
        } else {
            tl = roleDao.getAllWithRource(role1);
        }

        for(int i=0;i<tl.size();i++){
            Role role2=tl.get(i);
            Prole prole=new Prole();

            BeanUtils.copyProperties(role2,prole);
            prole.setIconCls("status_online");

            List<Resource> resourceList=role2.getResources();
            StringBuilder ids=new StringBuilder();
            StringBuilder names=new StringBuilder();
            boolean b = false;
            for (int m=0;m<resourceList.size();m++){
                Resource resource=resourceList.get(m);
                if(b){
                    ids.append(",");
                    names.append(",");
                }else{
                    b=true;
                }
                ids.append(resource.getId());
                names.append(resource.getName());
            }
            prole.setResourceIds(ids.toString());
            prole.setResourceNames(names.toString());

            rl.add(prole);

        }
        return rl;
    }

    @Override
    public void delete(String id) {
        //删除中间表
        UserRoleKey userRoleKey=new UserRoleKey();
        userRoleKey.setTroleId(id);
        userRoleMapper.deleteByPrimaryRoleId(userRoleKey);

        RoleResourceKey roleResourceKey=new RoleResourceKey();
        roleResourceKey.setTroleId(id);
        roleResourceMapper.deleteByPrimaryRoleResourceKey(roleResourceKey);
        //再删除role
        roleDao.deleteByPrimaryKey(id);
    }

    @Override
    public List<Tree> tree(SessionInfo sessionInfo) {
        List<Role> l = null;
        List<Tree> lt = new ArrayList<Tree>();

        Role role1=new Role();
        if (sessionInfo != null) {

            role1.setId(sessionInfo.getId());
            l = roleDao.getAllWithUserId(role1);// 查自己有权限的角色
        } else {
            l = roleDao.getAllWithUserId(role1);
        }


        if (l != null && l.size() > 0) {
            for (Role t : l) {
                Tree tree = new Tree();
                BeanUtils.copyProperties(t, tree);
                tree.setText(t.getName());
                tree.setIconCls("status_online");
                lt.add(tree);
            }
        }
        return lt;
    }

    @Override
    public List<Tree> allTree() {
        return this.tree(null);
    }

    @Override
    public void grant(Prole role) {
        Role r=roleDao.selectByPrimaryKey(role.getId());
        List<String> ids=new ArrayList<>();
        if (role.getResourceIds() != null && !role.getResourceIds().equalsIgnoreCase("")) {
            for (String id : role.getResourceIds().split(",")) {
               ids.add(id);

            }
            resourceDao.getAllWithIds(ids);
        }else {

        }
    }
}
