package com.zx.mes.test;

import com.alibaba.fastjson.JSON;
import com.zx.mes.dao.mes.CareMapper;
import com.zx.mes.dao.mes.CareTypeMapper;

import com.zx.mes.model.mes.Care;
import com.zx.mes.model.mes.CareType;
import org.apache.log4j.Logger;
import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/8/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml","classpath:spring-druid.xml" })
public class pollute {
    private static final Logger logger=Logger.getLogger(pollute.class);

    @Autowired
    private CareTypeMapper careTypeMapper;

    @Autowired
    private CareMapper careMapper;

    @org.junit.Test
    public void test(){
        CareType careType=new CareType();
        logger.info(JSON.toJSONStringWithDateFormat(careTypeMapper.getAll(careType),"yyyy-MM-dd HH:mm:ss"));
    }

    @Test
    public void test2(){
        Care care=new Care();
        logger.info(JSON.toJSONStringWithDateFormat(careMapper.getAllWithCareType(care),"yyyy-MM-dd HH:mm:ss"));
    }


}
