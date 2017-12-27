package com.hudui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yanghailong on 2017/12/27.
 */
@Controller
@RequestMapping("/home")
public class HelloController {

    @RequestMapping(value = "/hello")
    public String home(Model model) {
        return "hello";
    }

}
