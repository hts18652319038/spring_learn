package com.xzit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.xzit")
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {
}
