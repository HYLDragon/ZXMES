package com.zx.mes.dao.mes;

import com.zx.mes.model.mes.Bar001;
import com.zx.mes.model.mes.Bar002;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Bar002Mapper {
    int insert(Bar002 record);

    int insertSelective(Bar002 record);

    List<Bar002> getAllByBar002(Bar002 bar);
}