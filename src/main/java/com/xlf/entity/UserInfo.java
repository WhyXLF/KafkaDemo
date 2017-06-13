package com.xlf.entity;

import lombok.Data;

/**
 * author: xiaoliufu
 * date:   2017/6/5.
 * description: 用户信息表
 */
@Data
public class UserInfo {
    private int id;
    private String userName;
    private String password;
    private int role;
    private String email;
}
