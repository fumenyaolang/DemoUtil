package com.demos.design.bridge;

/**
 * Created by fumenyaolang on 2016-01-07.
 */
public class MyBridge extends bridge {
    public void method() {
        getSource().method();
    }
}
