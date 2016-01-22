package com.demos.design.chain;

/**
 * Created by fumenyaolang on 2016-01-20.
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    public void operator() {
        System.out.println("name: " + name);
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
