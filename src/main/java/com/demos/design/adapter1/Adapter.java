package com.demos.design.adapter1;

import com.demos.design.builder.*;

/**
 * 类的适配器模式
 * Created by fumenyaolang on 2016-01-04.
 */
public class Adapter extends Adaptee implements Target{
    public void method1() {
        System.out.println("Adaptee.method1");
    }
}
