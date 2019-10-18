package com.sample.nacos.spring.boot;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Nacos 控制台添加配置：
 * Data ID：
 * 		datasource.properties
 * Group：
 * 		DEFAULT_GROUP
 * 配置内容示例：
 * 		spring.datasource.url=jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8
 * 		spring.datasource.username=root
 * 		spring.datasource.password=root
 * 		spring.datasource.driver-class-name=com.mysql.jdbc.Driver
 *
 */
@SpringBootApplication
@NacosPropertySource(dataId = "mysql.properties")
public class SpringBootMySQLApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMySQLApplication.class, args);
    }
}
