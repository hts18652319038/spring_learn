package com.xzit;

import com.xzit.config.SpringConfig;
import com.xzit.service.ResourceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourceService resourceService = context.getBean(ResourceService.class);
        boolean flag = resourceService.openURL("http://www.baidu.com/haha","123456");
        System.out.println(flag);
    }
}
