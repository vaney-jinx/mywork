package com.mywork.spring.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
    /**
     * 登录
     *
     * @param data 参数
     * @return 返回值信息
     */
    @ResponseBody
    @RequestMapping(value = "/signIn", method = RequestMethod.POST)
    public String signIn(@RequestBody String data) {
        System.out.println("data===" + data);
        return data;
    }
}
