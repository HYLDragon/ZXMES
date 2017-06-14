package com.zx.mes.service.impl.admin;

import com.zx.mes.dao.admin.BugTypeMapper;
import com.zx.mes.model.admin.BugType;
import com.zx.mes.service.admin.BugTypeServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/6/14.
 */
@Service
public class BugTypeServiceImpl implements BugTypeServiceI {

    @Autowired
    private BugTypeMapper bugTypeMapper;

    @Override
    @Cacheable(value = "bugTypeServiceCache", key = "'bugTypeList'")
    public List<BugType> getBugTypeList() {
        return bugTypeMapper.getAll(new BugType());
    }
}
