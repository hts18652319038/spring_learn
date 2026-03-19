package com.xzit.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.xzit.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.xzit")
public class SpringConfig {
    //1.定义一个方法获得要管理的对象
    //2.添加@Bean 表示当前方法返回值是一个bean
    @Bean
    public DataSource dataSource(BookDao bookDao) {
        System.out.println(bookDao);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/mybatis?characterEncoding=utf8&useUnicode=true&serverTimezone=GMT%2B8&useSSL=false&&allowPublicKeyRetrieval=true");
        ds.setUsername("root");
        ds.setPassword("88888888");
        return ds;
    }
}
