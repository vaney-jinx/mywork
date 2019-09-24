package com.mywork.spring.dao.user;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List getUser();

    Map getLoginUser(@Param("userName") String userName, @Param("password")String password);
}
