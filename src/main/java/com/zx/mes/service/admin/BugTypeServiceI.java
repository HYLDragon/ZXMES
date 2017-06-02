package com.zx.mes.service.admin;

import java.util.List;

import com.zx.mes.model.admin.Tbugtype;

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
	public List<Tbugtype> getBugTypeList();

}
