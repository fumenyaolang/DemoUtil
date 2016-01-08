package com.demos.design.adapter2;

/**
 * Created by fumenyaolang on 2016-01-04.
 */
public class Test {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.method1();
        target.method2();
    }
}
