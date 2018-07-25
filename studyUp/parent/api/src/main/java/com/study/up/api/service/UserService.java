package com.study.up.api.service;

import com.study.up.api.entity.User;

public interface UserService {
    User queryByPk(String pk);
}
