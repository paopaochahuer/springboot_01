package com.atguigu.springboot.controller;

import com.atguigu.springboot.properties.DataSourceProperties;
import com.atguigu.springboot.properties.DataSourceProperties2;
import com.atguigu.springboot.properties.JdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(JdbcProperties.class)
public class HelloController {

    @Autowired
    DataSourceProperties dataSourceProperties;
//    @Autowired
//    DataSourceProperties2 dataSourceProperties2;

    @Autowired
    JdbcProperties jdbcProperties;

    //获取端口号
//    @Value("${server.port}")
//    private String port;

    @RequestMapping("/hello")
    public String hello(){

        System.out.println(dataSourceProperties);
//        System.out.println(dataSourceProperties2);
//        System.out.println("port"+port);
        System.out.println(jdbcProperties);

        return "hello spring";
    }
}
