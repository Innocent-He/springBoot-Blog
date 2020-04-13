package com.hgy.service;

import com.hgy.po.User;

/**
 * Created by He on 2020/4/15.
 */
public interface UserService {

    User checkUser(String username, String password);
}
