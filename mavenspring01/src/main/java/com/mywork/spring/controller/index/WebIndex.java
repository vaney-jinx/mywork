package com.mywork.spring.controller.index;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WebIndex {
    @RequestMapping(value = "/")
    public String showIndex(){
        return "mainPage";
    }
}
