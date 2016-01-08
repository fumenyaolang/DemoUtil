package com.demos.design.proxy;

/**
 * 真实主题：真正实现业务逻辑的类；
 * Created by fumenyaolang on 2016-01-05.
 */
public class Source implements  Sourceable {
    public void method() {
        System.out.println("Source.method");
    }
}
