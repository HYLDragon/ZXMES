package com.zx.mes.service.admin;

import java.util.List;

import com.zx.mes.pageModel.DataGrid;
import com.zx.mes.pageModel.PageHelper;
import com.zx.mes.pageModel.Puser;
import com.zx.mes.pageModel.SessionInfo;

/**
 * 用户Service
 * 
 * @author
 * 
 */
public interface UserServiceI {

	/**
	 * 用户登录
	 * 
	 * @param user
	 *            里面包含登录名和密码
	 * @return 用户对象
	 */
	public Puser login(Puser user);

	/**
	 * 用户注册
	 * 
	 * @param user
	 *            里面包含登录名和密码
	 * @throws Exception
	 */
	public void reg(Puser user) throws Exception;

	/**
	 * 获取用户数据表格
	 * 
	 * @param user
	 * @return
	 */
	public DataGrid dataGrid(Puser user, PageHelper ph);

	/**
	 * 添加用户
	 * 
	 * @param user
	 */
	public void add(Puser user) throws Exception;

	/**
	 * 获得用户对象
	 * 
	 * @param id
	 * @return
	 */
	public Puser get(String id);

	/**
	 * 编辑用户
	 * 
	 * @param user
	 */
	public void edit(Puser user) throws Exception;

	/**
	 * 删除用户
	 * 
	 * @param id
	 */
	public void delete(String id);

	/**
	 * 用户授权
	 * 
	 * @param ids
	 * @param user
	 *            需要user.roleIds的属性值
	 */
	public void grant(String ids, Puser user);

	/**
	 * 获得用户能访问的资源地址
	 * 
	 * @param id
	 *            用户ID
	 * @return
	 */
	public List<String> resourceList(String id);

	/**
	 * 编辑用户密码
	 * 
	 * @param user
	 */
	public void editPwd(Puser user);

	/**
	 * 修改用户自己的密码
	 * 
	 * @param sessionInfo
	 * @param oldPwd
	 * @param pwd
	 * @return
	 */
	public boolean editCurrentUserPwd(SessionInfo sessionInfo, String oldPwd, String pwd);

	/**
	 * 用户登录时的autocomplete
	 * 
	 * @param q
	 *            参数
	 * @return
	 */
	public List<Puser> loginCombobox(String q);

	/**
	 * 用户登录时的combogrid
	 * 
	 * @param q
	 * @param ph
	 * @return
	 */
	public DataGrid loginCombogrid(String q, PageHelper ph);

	/**
	 * 用户创建时间图表
	 * 
	 * @return
	 */
	public List<Long> userCreateDatetimeChart();

}
