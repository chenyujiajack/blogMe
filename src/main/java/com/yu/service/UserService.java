package com.yu.service;

import com.yu.po.User;

public interface UserService {
    User checkUser(String username, String password);

}
