package com.atguigu.springboot.config;

import com.atguigu.springboot.properties.DataSourceProperties3;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@SpringBootConfiguration
public class JdbConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.jdbc.datasource")
    public DataSourceProperties3 dataSourceProperties3(){
        return new DataSourceProperties3();
    }
}
