package com.zx.mes.test;

import com.alibaba.fastjson.JSON;
import com.zx.mes.dao.mes.*;
import com.zx.mes.model.mes.*;
import org.apache.log4j.Logger;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/6/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml","classpath:spring-druid.xml" })
public class Test2 {

    private static final Logger logger=Logger.getLogger(Test2.class);

    @Autowired
    private RfidcardMapper rfidcardMapper;

    @Autowired
    private Bar001Mapper bar001Mapper;
    @Autowired
    private Bar002Mapper bar002Mapper;
    @Autowired
    private Bar003Mapper bar003Mapper;
    @Autowired
    private Bar100Mapper bar100Mapper;

    @org.junit.Test
    public void test(){
        Rfidcard rfidcard=new Rfidcard();
        logger.info(JSON.toJSONStringWithDateFormat(rfidcardMapper.count(rfidcard),"yyyy-MM-dd HH:mm:ss"));
    }

    @org.junit.Test
    public void test3(){
        Bar002 bar=new Bar002();
        logger.info(JSON.toJSONStringWithDateFormat(bar002Mapper.count(bar),"yyyy-MM-dd HH:mm:ss"));
    }

    @org.junit.Test
    public void test4(){
        Bar003 bar=new Bar003();
        logger.info(JSON.toJSONStringWithDateFormat(bar003Mapper.count(bar),"yyyy-MM-dd HH:mm:ss"));
    }


    @org.junit.Test
    public void test5(){
        Bar100 bar=new Bar100();
        logger.info(JSON.toJSONStringWithDateFormat(bar100Mapper.count(bar),"yyyy-MM-dd HH:mm:ss"));
    }

    @org.junit.Test
    public void test6(){
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       // logger.info(JSON.toJSONStringWithDateFormat(new Date().getTime(),"yyyy-MM-dd HH:mm:ss"));
        //double ddddd=((42452.431400463-(70*365+19))*100000*24-8)*6*6;
        double ddddd=(42469.404710648-3)*24*60*60*1000-(70*365*24+10)*60*60*1000;

        Date date=new Date((long) ddddd);

        logger.info(JSON.toJSONStringWithDateFormat(sf.format(date),"yyyy-MM-dd HH:mm:ss"));
    }

    @org.junit.Test
    public void test7(){

    }
}
