package com.demos.jdk.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by fumenyaolang on 2015-12-08.
 */
public class ServletDemo extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("**********************************");
        System.out.println("--------------init-----------------");
        System.out.println("**********************************");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h1>jdk servlet demo<h1>");
        out.close();
    }

    @Override
    public void destroy() {
        System.out.println("**********************************");
        System.out.println("--------------destroy-----------------");
        System.out.println("**********************************");
    }
}
