package com.demos.design.decorator;

/**
 * 装饰者模式
 * Created by fumenyaolang on 2016-01-05.
 */
public class Decorator implements Sourceable{
    private Sourceable source= null;
    public Decorator(Sourceable source){
        this.source = source;
    }
    public void mothod() {
        System.out.println("before");
        source.mothod();
        System.out.println("after");
    }
}
