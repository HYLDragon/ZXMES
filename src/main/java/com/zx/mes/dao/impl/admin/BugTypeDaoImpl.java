package com.zx.mes.dao.impl.admin;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.zx.mes.dao.admin.BugTypeDaoI;
import com.zx.mes.dao.impl.BaseDaoImpl;
import com.zx.mes.model.admin.Tbugtype;

@Repository
public class BugTypeDaoImpl extends BaseDaoImpl<Tbugtype> implements BugTypeDaoI {

	@Override
	@Cacheable(value = "bugTypeDaoCache", key = "#id")
	public Tbugtype getById(String id) {
		return super.get(Tbugtype.class, id);
	}

}
