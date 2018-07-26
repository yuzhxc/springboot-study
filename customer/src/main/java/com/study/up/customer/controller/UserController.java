package com.study.up.customer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.study.up.api.entity.User;
import com.study.up.api.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("queryOne")
    public User queryOne(@RequestParam("pk") String pk) {
        User user = userService.queryByPk("");
        return user;
    }
}
