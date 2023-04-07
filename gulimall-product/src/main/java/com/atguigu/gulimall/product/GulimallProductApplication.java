package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
integrated with Mybatis-plus
step 1:
    import dependencies
    <dependency>
        <groupId>com.baomidou</groupId>
        <artifactId>mybatis-plus-boot-starter</artifactId>
        <version>3.2.0</version>
    </dependency>
step 2:
    config data source
    1) import database driver
    2) create an application.yml file, config data source details
    spring:
        datasource:
            username: root
            password: root
            url: jdbc:mysql://192.168.56.10:3306/gulimall_pms
            driver-class-name: com.mysql.jdbc.Driver
step 3:
    configure MyBatis-Plus
    1) use @MapperScan to tell myBatis which package to scan to get mapper info
    2) config sql mapper file location
 */
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
