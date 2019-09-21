package com.mywork.spring.service;

import com.mywork.spring.annotation.AddRedis;
import com.mywork.spring.dao.user.UserMapper;
import com.mywork.spring.service.base.ServiceBase;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("userService")
public class UserServiceImpl extends ServiceBase implements UserServiceBase {
    @AddRedis(key = "userList")
    public List getUser() {
        UserMapper userMapper = getBean("userMapper");
        return userMapper.getUser();
    }
}
