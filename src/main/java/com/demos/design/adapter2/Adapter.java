package com.demos.design.adapter2;

/**
 * 对象的适配器模式
 * Created by fumenyaolang on 2016-01-04.
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public void method1() {
        System.out.println("Adaptee.method1");
    }

    public void method2() {
        if (adaptee == null)
            adaptee = new Adaptee();
        adaptee.method2();
    }
}
