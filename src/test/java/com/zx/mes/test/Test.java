package com.zx.mes.test;




import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.zx.mes.dao.admin.BugMapper;
import com.zx.mes.dao.admin.ResourceMapper;
import com.zx.mes.dao.admin.RoleMapper;
import com.zx.mes.dao.admin.UserMapper;
import com.zx.mes.model.admin.Bug;
import com.zx.mes.model.admin.Resource;
import com.zx.mes.model.admin.Role;
import com.zx.mes.model.admin.User;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml","classpath:spring-druid.xml" })
public class Test {

    private static  final Logger logger=Logger.getLogger(Test.class);

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private BugMapper bugMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private ResourceMapper resourceMapper;
    public static void main(String[] args) {

    }
    @org.junit.Test
    public void test1(){
        //Puser user=userMapper.selectByPrimaryKey("0");
        //System.out.print(user.getName());
        User user=new User();
        PageHelper.startPage(1,8);
        logger.info(JSON.toJSONStringWithDateFormat(userMapper.getAllWithRole(user),"yyyy-MM-dd HH:mm:ss"));
        //logger.info(JSON.toJSONStringWithDateFormat(userMapper.getAll(user),"yyyy-MM-dd HH:mm:ss"));
    }
    @org.junit.Test
    public void test2(){
        Bug bug=new Bug();

        logger.info(JSON.toJSONStringWithDateFormat(bugMapper.getAllWithBugType(bug),"yyyy-MM-dd HH:mm:ss"));
    }
    @org.junit.Test
    public void test3(){
        User user=new User();
        PageHelper.startPage(1,8);
        logger.info(JSON.toJSONStringWithDateFormat(userMapper.getAll(user),"yyyy-MM-dd HH:mm:ss"));
    }
    @org.junit.Test
    public void test4(){
        Role role=new Role();
        role.setId("0");
        List<Role> list = roleMapper.getAllWithUserId(role);
        //logger.info(JSON.toJSONStringWithDateFormat(list,"yyyy-MM-dd HH:mm:ss"));
        logger.info(JSON.toJSONStringWithDateFormat(list,"yyyy-MM-dd HH:mm:ss"));

    }
    @org.junit.Test
    public void test5(){
        List ids = new ArrayList();
        ids.add("5711ad85-ff8");
        ids.add("bargl");
        ids.add("barView");

        logger.info(JSON.toJSONStringWithDateFormat(resourceMapper.getAllWithIds(ids),"yyyy-MM-dd HH:mm:ss"));

    }
    @org.junit.Test
    public void test6(){
        Resource resource=new Resource();
        logger.info(JSON.toJSONStringWithDateFormat(resourceMapper.getResourceWithType(resource),"yyyy-MM-dd HH:mm:ss"));
    }

    @org.junit.Test
    public void test7(){
        Resource resource=new Resource();
        resource.setUserId("2");
        logger.info(JSON.toJSONStringWithDateFormat(resourceMapper.getResourceWithTypeUser(resource),"yyyy-MM-dd HH:mm:ss"));
    }
}
