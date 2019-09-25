package com.mywork.spring.service;

import com.mywork.spring.annotation.AddRedis;
import com.mywork.spring.dao.user.UserMapper;
import com.mywork.spring.dto.user.UserDto;
import com.mywork.spring.service.base.ServiceBase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service("userService")
public class UserService extends ServiceBase {
    @AddRedis(key = "userList")
    public List getUser() {
        UserMapper userMapper = getBean("userMapper");
        return userMapper.getUser();
    }

    public String login(UserDto userDto) throws Exception {
        UserMapper userMapper = getBean("userMapper");
        Map map = userMapper.getLoginUser(userDto);
        if ( Objects.isNull(map) || map.isEmpty()){
            throw new Exception("账号密码错误或者用户不存在");
        }
        return"登录成功";
    }
}
