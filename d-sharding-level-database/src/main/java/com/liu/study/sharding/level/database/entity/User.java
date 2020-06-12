package com.liu.study.sharding.level.database.entity;

import lombok.Data;

/**
 * @desc 
 * @author Liuweian
 * @createTime 2020/6/11 13:30
 * @version 1.0.0
 */
@Data
public class User {

    /**
     * 如果使用snowflake算法生成主键的话，这个uid必须是Long类型的，
     */
    private Long uid;

    private String username;

    private String password;

    private String status;

    private Long merchantId;

    private int age;
}
