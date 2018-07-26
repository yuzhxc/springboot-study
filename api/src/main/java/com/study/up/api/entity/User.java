package com.study.up.api.entity;

import com.study.up.api.base.entity.SuperVO;
import lombok.Data;

@Data
public class User extends SuperVO {
    private String name;
    private String code;
}
