package com.zx.mes.dao.mes;

import com.zx.mes.model.mes.Bar001;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Bar001Mapper {
    int insert(Bar001 record);

    int insertSelective(Bar001 record);

    List<Bar001> getAllByBar001(Bar001 bar);
}