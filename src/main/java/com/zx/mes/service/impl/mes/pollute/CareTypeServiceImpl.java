package com.zx.mes.service.impl.mes.pollute;

import com.zx.mes.dao.mes.CareTypeMapper;
import com.zx.mes.model.mes.CareType;
import com.zx.mes.service.mes.pollute.CareTypeServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/23.
 */
@Service
public class CareTypeServiceImpl implements CareTypeServiceI {

    @Autowired
    private CareTypeMapper careTypeMapper;

    @Override
    @Cacheable(value = "careTypeServiceCache", key = "'careTypeList'")
    public List<CareType> getCareTypeList() {
        return careTypeMapper.getAll(new CareType());
    }
}
