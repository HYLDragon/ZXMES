package com.zx.mes.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/6/13.
 */
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml","classpath:spring-druid.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestUserService {

}
