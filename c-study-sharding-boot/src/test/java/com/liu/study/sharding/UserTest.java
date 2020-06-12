package com.liu.study.sharding;

import com.liu.study.sharding.jdbc.entity.User;
import com.liu.study.sharding.jdbc.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @desc 
 * @author Liuweian
 * @createTime 2020/6/11 15:45
 * @version 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void addUserTest() {
        User user = new User();
        user.setUsername("liuweian");
        user.setPassword("lsie");
        user.setStatus("1");
        user.setAge(12);
        user.setMerchantId(100L);
        userMapper.insert(user);
    }
}
