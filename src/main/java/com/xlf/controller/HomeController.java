package com.xlf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

/**
 * author: xiaoliufu
 * date:   2017/6/5.
 * description: 跳转主页
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(ModelMap modelMap, Principal principal) {
        if (principal != null) {
            String name = principal.getName();
            modelMap.put("userName", name);
        }
        return "/home";
    }

    @RequestMapping("/home")
    public String home2(ModelMap modelMap,Principal principal) {
        if (principal != null) {
            String name = principal.getName();
            modelMap.put("userName", name);
        }
        return "/home";
    }
}
