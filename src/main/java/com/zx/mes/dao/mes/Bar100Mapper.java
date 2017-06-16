package com.zx.mes.dao.mes;

import com.zx.mes.model.mes.Bar100;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Bar100Mapper {
    int insert(Bar100 record);

    int insertSelective(Bar100 record);

    List<Bar100> getAllByBar100(Bar100 bar);
}