package com.demos.design.chain;

/**
 * Created by fumenyaolang on 2016-01-20.
 */
public class Test {
    public static void main(String[] args) {
        MyHandler handler1 = new MyHandler("A1");
        MyHandler handler2 = new MyHandler("A2");
        MyHandler handler3 = new MyHandler("A3");

        handler1.setHandler(handler2);
        handler2.setHandler(handler3);

        handler1.operator();

    }
}
