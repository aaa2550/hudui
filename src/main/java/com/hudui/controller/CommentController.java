package com.hudui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yanghailong on 2017/12/27.
 */
@Controller
@RequestMapping("/comment")
public class CommentController {

    @RequestMapping(value = "/get")
    public String get() {
        return "comment";
    }

}
