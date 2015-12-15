package com.demos.jdk.dao;

import com.demos.vo.User;

/**
 * Created by fumenyaolang on 2015-12-14.
 */
public interface UserDao {
    /**
     * get user info by userName ane passwd
     *
     * @param userName
     * @param passwd
     * @return
     */
    public User getUser(String userName, String passwd);
}
