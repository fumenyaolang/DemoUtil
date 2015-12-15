package com.demos.jdk.dao.impl;

import com.demos.jdk.dao.UserDao;
import com.demos.vo.User;

/**
 * Created by fumenyaolang on 2015-12-14.
 */
public class UserDaoImpl implements UserDao {

    //simulate userName and passwd
    private String db_userName = "admin";
    private String db_passwd = "admin123";

    public User getUser(String userName, String passwd) {
        User user = null;
        if (this.db_userName.equals(userName) && this.db_passwd.equals(passwd)) {
            user = new User();
            user.setUserName(db_userName);
        }
        return user;
    }
}
