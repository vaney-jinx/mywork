package com.mywork.spring.dao.user;

import com.mywork.spring.dto.user.UserDto;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List getUser();

    Map getLoginUser(UserDto userDto);
}
