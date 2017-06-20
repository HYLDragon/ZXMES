package com.zx.mes.dao.mes;

import com.zx.mes.model.mes.Bar001;
import com.zx.mes.model.mes.Bar003;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Bar003Mapper {
    int insert(Bar003 record);

    int insertSelective(Bar003 record);

    List<Bar003> getAllByBar003(Bar003 bar);

    long count(Bar003 bar);
}