package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootConfiguration 等价于configuration
 * @EnableAutoConfiguration  决定哪些配置生效
 * @ComponentScan 默认扫描主程序所在的包及子包
 */
@SpringBootApplication//声明当前应用为springboot应用
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
