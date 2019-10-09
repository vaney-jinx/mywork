package com.mywork.spring.controller.login;

import com.mywork.spring.controller.base.BaseController;
import com.mywork.spring.dto.user.UserDto;
import com.mywork.spring.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/login")
public class LoginController extends BaseController {
    @Autowired
    UserService userService;

    /**
     * 登录
     *
     * @param data 参数
     * @return 返回值信息
     */
    @ResponseBody
    @RequestMapping(value = "/signIn", method = RequestMethod.POST)
    public String signIn(@RequestBody String data) {
        try {
            System.out.println("data===" + data);
            UserDto userDto = (UserDto) JSONObject.toBean(getJsonData(data), UserDto.class);
            userService.login(userDto);
            return returnOkWrapper(userDto);
        } catch (Throwable e) {
            e.printStackTrace();
            return returnErrorWrapper(e.getMessage());
        }
    }

    @ResponseBody
    @RequestMapping("/qqLogin")
    public String qqLogin() {
        return returnOkWrapper("");
    }

    @ResponseBody
    @RequestMapping("/qqLoginCall")
    public String qqLoginCall() {
        return returnOkWrapper("");
    }
}
