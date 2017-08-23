package com.zx.mes.dao.mes;

import com.zx.mes.model.mes.Care;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CareMapper {
    int deleteByPrimaryKey(String id);

    int insert(Care record);

    int insertSelective(Care record);

    Care selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Care record);

    int updateByPrimaryKey(Care record);

    List<Care> getAllWithCareType(Care care);
}