package com.zx.mes.dao.admin;

import com.zx.mes.model.admin.ResourceType;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(ResourceType record);

    int insertSelective(ResourceType record);

    ResourceType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ResourceType record);

    int updateByPrimaryKey(ResourceType record);
}