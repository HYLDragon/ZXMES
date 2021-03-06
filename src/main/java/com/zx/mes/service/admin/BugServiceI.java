package com.zx.mes.service.admin;

import com.zx.mes.pageModel.Pbug;
import com.zx.mes.pageModel.DataGrid;
import com.zx.mes.pageModel.PageHelper;

/**
 * 
 * @author 
 * 
 */
public interface BugServiceI {

	/**
	 * 获取BUG数据表格
	 * 
	 * @param bug
	 *            参数
	 * @param ph
	 *            分页帮助类
	 * @return
	 */
	public DataGrid dataGrid(Pbug bug, PageHelper ph);

	/**
	 * 添加BUG
	 * 
	 * @param bug
	 */
	public void add(Pbug bug);

	/**
	 * 获得BUG对象
	 * 
	 * @param id
	 * @return
	 */
	public Pbug get(String id);

	/**
	 * 修改BUG
	 * 
	 * @param bug
	 */
	public void edit(Pbug bug);

	/**
	 * 删除BUG
	 * 
	 * @param id
	 */
	public void delete(String id);

}
