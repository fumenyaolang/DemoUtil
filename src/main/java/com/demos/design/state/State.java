package com.demos.design.state;

/**
 * 状态模式
 * Created by fumenyaolang on 2016-01-21.
 */
public class State {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1() {
        System.out.println("exec method1");
    }

    public void method2() {
        System.out.println("exec method2");
    }
}
