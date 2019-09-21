package com.mywork.spring.controller;

import com.mywork.spring.service.UserServiceBase;
import com.mywork.spring.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class UserController extends BaseController {

    @RequestMapping(value = "/showUser")
    public String showUser(Model model) {
        UserServiceBase userServiceBase = getBean("userService");
        List users = userServiceBase.getUser();
        model.addAttribute("users", users);
        return "getUser";
    }
}
