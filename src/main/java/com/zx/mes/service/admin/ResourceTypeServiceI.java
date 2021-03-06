package com.zx.mes.service.admin;

import java.util.List;

import com.zx.mes.pageModel.PresourceType;

/**
 * 资源类型服务
 * 
 * @author 
 * 
 */
public interface ResourceTypeServiceI {

	/**
	 * 获取资源类型
	 * 
	 * @return
	 */
	public List<PresourceType> getResourceTypeList();

}
