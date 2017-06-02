package com.zx.mes.service.impl.admin;

import java.util.ArrayList;
import java.util.List;

import com.zx.mes.dao.admin.ResourceTypeDaoI;
import com.zx.mes.model.admin.Tresourcetype;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.zx.mes.pageModel.ResourceType;
import com.zx.mes.service.admin.ResourceTypeServiceI;

@Service
public class ResourceTypeServiceImpl implements ResourceTypeServiceI {

	@Autowired
	private ResourceTypeDaoI resourceType;

	@Override
	@Cacheable(value = "resourceTypeServiceCache", key = "'resourceTypeList'")
	public List<ResourceType> getResourceTypeList() {
		List<Tresourcetype> l = resourceType.find("from Tresourcetype t");
		List<ResourceType> rl = new ArrayList<ResourceType>();
		if (l != null && l.size() > 0) {
			for (Tresourcetype t : l) {
				ResourceType rt = new ResourceType();
				BeanUtils.copyProperties(t, rt);
				rl.add(rt);
			}
		}
		return rl;
	}

}
