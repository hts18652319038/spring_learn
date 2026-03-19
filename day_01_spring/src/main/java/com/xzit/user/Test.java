package com.xzit.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        // 加载spring容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
        /*UserDao dao = (UserDao) ctx.getBean("userDao1");
        System.out.println(dao);*/
        Boy boy = (Boy) ctx.getBean("boy");
        boy.setName("张三");
        boy.setAge(20);
        System.out.println(boy);
    }
}
