package com.demos.jdk.service.impl;

import com.demos.jdk.dao.UserDao;
import com.demos.jdk.dao.impl.UserDaoImpl;
import com.demos.jdk.service.UserService;
import com.demos.vo.User;
import org.apache.commons.lang.StringUtils;

/**
 * Created by fumenyaolang on 2015-12-11.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public  UserServiceImpl() {
        if (userDao == null)
            userDao = new UserDaoImpl();
    }

    public User verifyUserInfo(String userName, String passwd) {
        if (StringUtils.isBlank(userName) || StringUtils.isBlank(passwd))
            return null;

        return userDao.getUser(userName, passwd);
    }
}
