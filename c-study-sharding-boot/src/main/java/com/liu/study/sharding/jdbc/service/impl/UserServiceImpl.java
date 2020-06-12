package com.liu.study.sharding.jdbc.service.impl;

import com.liu.study.sharding.jdbc.mapper.UserMapper;
import com.liu.study.sharding.jdbc.entity.User;
import com.liu.study.sharding.jdbc.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @desc 
 * @author Liuweian
 * @createTime 2020/6/11 13:29
 * @version 1.0.0
 */
@Service
public class UserServiceImpl implements IUserService {

    private UserMapper userMapper;

    @Override
    public int addUserInfo(User userEntity) {
        return 0;
    }
}
