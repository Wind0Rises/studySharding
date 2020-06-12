package com.liu.study.sharding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @desc 
 * @author Liuweian
 * @createTime 2020/6/11 13:27
 * @version 1.0.0
 */
@SpringBootApplication
@MapperScan("com.liu.study.sharding.jdbc.mapper")
public class ShardingBootApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ShardingBootApplication.class, args);
    }

}
