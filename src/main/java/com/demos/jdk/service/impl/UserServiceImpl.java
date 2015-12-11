package com.demos.jdk.service.impl;

import com.demos.jdk.service.UserService;
import com.demos.vo.User;
import org.apache.commons.lang.StringUtils;

/**
 * Created by fumenyaolang on 2015-12-11.
 */
public class UserServiceImpl implements UserService {

    public User verifyUserInfo(String userName, String password) {
        if (StringUtils.isBlank(userName) || StringUtils.isBlank(password))
            return null;

        return null;
    }
}
