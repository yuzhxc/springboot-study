package com.study.up.server.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.study.up.api.entity.User;
import com.study.up.api.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    public User queryByPk(String pk) {
        User user = new User();
        user.setCode("success");
        user.setName("成功！");
        return user;
    }
}
