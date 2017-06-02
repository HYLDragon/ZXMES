package com.zx.mes.dao.admin;

import com.zx.mes.dao.BaseDaoI;
import com.zx.mes.model.admin.Tbugtype;

public interface BugTypeDaoI extends BaseDaoI<Tbugtype> {

	/**
	 * 通过ID获得BUG类型
	 * 
	 * @param id
	 * @return
	 */
	public Tbugtype getById(String id);

}
