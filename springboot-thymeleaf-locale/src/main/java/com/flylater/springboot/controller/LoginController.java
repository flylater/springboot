package com.flylater.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : Flylater
 * @version : 1.0
 * @date : 2020/4/26
 */
@Controller
public class LoginController {

    @RequestMapping({"/", "/login"})
    public String index() {
        return "login";
    }

}
