package com.demos.jdk.servlet;

import com.demos.jdk.service.UserService;
import com.demos.jdk.service.impl.UserServiceImpl;
import com.demos.util.HttpHeadUtil;
import com.demos.vo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by fumenyaolang on 2015-12-09.
 */
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpHeadUtil.showHeadInfo(request);
        String userName = request.getParameter("userName");
        String passwd = request.getParameter("passwd");

        UserService userService = new UserServiceImpl();
        User user = userService.verifyUserInfo(userName, passwd);
        if (user == null)
            response.sendRedirect("/register/fail.jsp");
        response.sendRedirect("/register/success.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
