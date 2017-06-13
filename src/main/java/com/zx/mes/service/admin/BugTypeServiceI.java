package com.zx.mes.service.admin;

import java.util.List;

import com.zx.mes.model.admin.BugType;


/**
 * 
 * @author 
 * 
 */
public interface BugTypeServiceI {

	/**
	 * 获得BUG类型列表
	 * 
	 * @return
	 */
	public List<BugType> getBugTypeList();

}
