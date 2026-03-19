package com.xzit;

import com.xzit.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AppSystemProperties {
    public static void main(String[] args) {
        // 加载类路径下的配置文件
        ApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\Program Files\\java_workspace\\springFramework\\day_Spring_datasource\\src\\main\\resources\\applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}
