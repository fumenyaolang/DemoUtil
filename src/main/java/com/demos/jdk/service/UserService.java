package com.demos.jdk.service;

import com.demos.vo.User;

/**
 * user service
 * Created by fumenyaolang on 2015-12-11.
 */
public interface UserService {

    public User verifyUserInfo(String userName, String password);

}