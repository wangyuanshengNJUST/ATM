package com.text.test;

import com.text.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 王元圣
 */
public class SpringTest {
    @Test
    public void run1(){
        ApplicationContext ac =new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService us = (UserService) ac.getBean("UserService");
        us.selectUserByUsername("1");
    }
}
