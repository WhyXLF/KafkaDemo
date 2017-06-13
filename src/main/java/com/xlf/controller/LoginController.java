package com.xlf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * author: xiaoliufu
 * date:   2017/6/5.
 * description: 登录API接口
 */
@Controller
public class LoginController {

    @RequestMapping(value = "login")
    public String login(ModelMap modelMap, Principal principal) {
        if (principal != null) {
            String name = principal.getName();
            modelMap.put("userName", name);
            return "/home";
        }
        return "/login";
    }
}
