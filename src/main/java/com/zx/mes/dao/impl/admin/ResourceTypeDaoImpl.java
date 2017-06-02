package com.zx.mes.dao.impl.admin;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.zx.mes.dao.admin.ResourceTypeDaoI;
import com.zx.mes.dao.impl.BaseDaoImpl;
import com.zx.mes.model.admin.Tresourcetype;

@Repository
public class ResourceTypeDaoImpl extends BaseDaoImpl<Tresourcetype> implements ResourceTypeDaoI {

	@Override
	@Cacheable(value = "resourceTypeDaoCache", key = "#id")
	public Tresourcetype getById(String id) {
		return super.get(Tresourcetype.class, id);
	}

}
