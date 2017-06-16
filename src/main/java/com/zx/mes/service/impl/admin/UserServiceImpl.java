package com.zx.mes.service.impl.admin;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;


import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;
import com.zx.mes.dao.admin.RoleMapper;
import com.zx.mes.dao.admin.UserMapper;
import com.zx.mes.dao.admin.UserRoleMapper;
import com.zx.mes.model.admin.Resource;
import com.zx.mes.model.admin.Role;
import com.zx.mes.model.admin.User;
import com.zx.mes.model.admin.UserRoleKey;
import com.zx.mes.pageModel.Puser;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.mes.pageModel.DataGrid;
import com.zx.mes.pageModel.PageHelper;
import com.zx.mes.pageModel.SessionInfo;
import com.zx.mes.service.admin.UserServiceI;
import com.zx.mes.util.MD5Util;

import javax.jws.soap.SOAPBinding;

@Service
public class UserServiceImpl implements UserServiceI {

	@Autowired
	private UserMapper userDao;

	@Autowired
	private RoleMapper roleMapper;

	@Autowired
	private UserRoleMapper userRoleMapper;

	@Override
	public Puser login(Puser user) {
		User user2=new User();
		user2.setName(user.getName());
		user2.setPwd(MD5Util.md5(user.getPwd()));

		User u=userDao.login(user2);
		if (u != null) {
			BeanUtils.copyProperties(u, user);
			return user;
		}

		return null;
	}

	@Override
	synchronized public void reg(Puser user) throws Exception {
		User user1=new User();
		user1.setName(user.getName());
		if (userDao.getUser(user1).size()>0){
			throw new Exception("登录名已存在!");
		}else{
			User u=new User();
			u.setId(UUID.randomUUID().toString());
			u.setName(user.getName());
			u.setPwd(MD5Util.md5(user.getPwd()));
			u.setCreatedatetime(new Date());
			userDao.insertSelective(u);
		}

	}

	@Override
	public DataGrid dataGrid(Puser user, PageHelper ph) {
		DataGrid dg = new DataGrid();
		List<Puser> ul = new ArrayList<Puser>();
		User u=new User();
		BeanUtils.copyProperties(user,u);
		com.github.pagehelper.PageHelper.startPage(ph.getPage(),ph.getRows());

		List<User> userList=userDao.getAll(u);

		List<User> userlist2=userDao.getAllWithRole(u);

		if(userList !=null && userList.size()>0){
			for(int i=0;i<userList.size();i++){
				Puser puser=new Puser();
				User user2=userList.get(i);
				BeanUtils.copyProperties(user2,puser);
				if(userlist2 !=null && userlist2.size()>0){
					for(int n=0;n<userlist2.size();n++){
						StringBuilder roleIds=new StringBuilder("");
						StringBuilder roleNames=new StringBuilder("");
						boolean b=false;
						if (user2.getId().equals(userlist2.get(n).getId())){
							List<UserRoleKey> roles=userlist2.get(n).getUserRoleKeys();
							for(int m=0;m<roles.size();m++){
								if (b) {
									roleIds.append( ",");
									roleNames.append( ",");
								} else {
									b = true;
								}
								roleIds.append( roles.get(m).getRole().getId());
								roleNames.append(roles.get(m).getRole().getName());

							}
							puser.setRoleIds(roleIds.toString());
							puser.setRoleNames(roleNames.toString());
						}

					}
				}
				ul.add(puser);
			}
		}

		dg.setRows(ul);
		//com.github.pagehelper.PageHelper.startPage(ph.getPage(),ph.getRows());
		dg.setTotal((long)userDao.sum(u).size());
		return dg;
	}

	@Override
	synchronized public void add(Puser user) throws Exception {
		User user2=new User();
		user2.setName(user.getName());

		if(userDao.getUser(user2).size()>0){
			throw new Exception("登录名已存在！");
		}else{
			User u = new User();
			BeanUtils.copyProperties(user, u);
			u.setCreatedatetime(new Date());
			u.setPwd(MD5Util.md5(user.getPwd()));
			userDao.insertSelective(u);
		}


	}

	@Override
	public Puser get(String id) {
		Puser puser=new Puser();

		User user=new User();
		user.setId(id);
		user=userDao.getAllWithRole(user).get(0);

		BeanUtils.copyProperties(user,puser);

		List<UserRoleKey> roles=user.getUserRoleKeys();
		StringBuilder roleIds=new StringBuilder();
		StringBuilder roleNames=new StringBuilder();
		boolean b=false;
		for(int i=0;i<roles.size();i++){
			if (b) {
				roleIds.append( ",");
				roleNames.append( ",");
			} else {
				b = true;
			}
			roleIds.append( roles.get(i).getRole().getId());
			roleNames.append(roles.get(i).getRole().getName());
		}
		puser.setRoleIds(roleIds.toString());
		puser.setRoleNames(roleNames.toString());

		return puser;
	}

	@Override
	synchronized public void edit(Puser user) throws Exception {
		User user1=new User();
		user1.setName(user.getName());
		if (userDao.getUser(user1).size() > 1) {
			throw new Exception("登录名已存在！");
		} else {
			User u = userDao.selectByPrimaryKey(user.getId());
			BeanUtils.copyProperties(user, u, new String[] { "pwd", "createdatetime" });
			u.setModifydatetime(new Date());
			userDao.updateByPrimaryKeySelective(u);
		}
	}

	@Override
	public void delete(String id) {
		//先删除中间表
		UserRoleKey userRoleKey=new UserRoleKey();
		userRoleKey.setTuserId(id);
		int key=userRoleMapper.deleteByPrimarySelectUserRole(userRoleKey);
		//再删除user表记录
		userDao.deleteByPrimaryKey(id);
	}

	//ids 选中的用户id ，user是将角色id拼接起来
	@Override
	public void grant(String ids, Puser user) {
		if (ids != null && ids.length() > 0) {
			List<Role> roles = new ArrayList<Role>();
			//用户本来有的权限
			if (user.getRoleIds() != null) {
				UserRoleKey userRoleKey=new UserRoleKey();
				for (String roleId : user.getRoleIds().split(",")) {
					//roles.add(roleMapper.selectByPrimaryKey(roleId));
					//获得roleId
					userRoleKey.setTroleId(roleId);
					String[] idArr=ids.split(",");
					for(int i=0;i< idArr.length;i++){
						if(idArr[i] !=null && ! idArr[i].equals("")){
							userRoleKey.setTuserId(idArr[i]);
							if (userRoleMapper.selectByPrimaryKey(userRoleKey)>0){

							}else{
								userRoleMapper.insert(userRoleKey);
							}
						}
					}
				}
			}


		}
	}

	@Override
	public List<String> resourceList(String id) {
		List<String> resourceList=new ArrayList<>();
		List<User> roleList=new ArrayList<>();

		User user=new User();
		user.setId(id);
		roleList=userDao.getAllWithRole(user);

		User user2=roleList.get(0);
		List<String> ids=new ArrayList<>();
		for (int i=0;i<user2.getUserRoleKeys().size();i++){
			//将所有记录role表的id添加进list中
			ids.add(user2.getUserRoleKeys().get(i).getRole().getId());
		}
		List<Role> list=roleMapper.getAllWithRourceByRoleIds(ids);
		if(list !=null && list.size()>0){
			for(int m=0;m<list.size();m++){
				List<Resource> resources=list.get(m).getResources();

				if(resources !=null && resources.size()>0){
					for (int n=0;n<resources.size();n++){
						if(resources.get(n) !=null && resources.get(n).getUrl() !=null ){
							resourceList.add(resources.get(n).getUrl());
						}
					}
				}
			}
		}

		return resourceList;
	}

	@Override
	public void editPwd(Puser user) {
		if (user != null && user.getPwd() != null && !user.getPwd().trim().equalsIgnoreCase("")) {
			User u = userDao.selectByPrimaryKey(user.getId());
			u.setPwd(MD5Util.md5(user.getPwd()));
			u.setModifydatetime(new Date());
		}
	}

	@Override
	public boolean editCurrentUserPwd(SessionInfo sessionInfo, String oldPwd, String pwd) {
		User u = userDao.selectByPrimaryKey(sessionInfo.getId());
		if (u.getPwd().equalsIgnoreCase(MD5Util.md5(oldPwd))) {// 说明原密码输入正确
			u.setPwd(MD5Util.md5(pwd));
			u.setModifydatetime(new Date());
			return true;
		}
		return false;
	}

	@Override
	public List<Puser> loginCombobox(String q) {
		if (q == null) {
			q = "";
		}
		User user=new User();
		user.setName("%" + q.trim() + "%");
		com.github.pagehelper.PageHelper.startPage(1,10);
		List<User> tl = userDao.getAll(user);
		List<Puser> ul = new ArrayList<Puser>();
		if (tl != null && tl.size() > 0) {
			for (User t : tl) {
				Puser u = new Puser();
				u.setName(t.getName());
				ul.add(u);
			}
		}
		return ul;
	}

	@Override
	public DataGrid loginCombogrid(String q, PageHelper ph) {
		if (q == null) {
			q = "";
		}
		DataGrid dg = new DataGrid();
		List<Puser> ul = new ArrayList<Puser>();
		User user=new User();
		user.setName("%" + q.trim()+"%");
		com.github.pagehelper.PageHelper.startPage(1,10);
		List<User> tl = userDao.getAll(user);
		if (tl != null && tl.size() > 0) {
			for (User t : tl) {
				Puser u = new Puser();
				u.setName(t.getName());
				u.setCreatedatetime(t.getCreatedatetime());
				u.setModifydatetime(t.getModifydatetime());
				ul.add(u);
			}
		}
		dg.setRows(ul);
		dg.setTotal(userDao.getCount(user));
		return dg;
	}

	@Override
	public List<Long> userCreateDatetimeChart() {
		List<Long> l = new ArrayList<Long>();
		int k = 0;
		User user=new User();
		for (int i = 0; i < 12; i++) {
			k = k + 2;
			user.setValue(k);
			user.setValue2(k+2);

			l.add(userDao.getCount(user));
		}
		return l;
	}

}
