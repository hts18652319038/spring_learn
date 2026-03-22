package com.xzit.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.xzit")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
