package com.demos.design.decorator;

/**
 * Created by fumenyaolang on 2016-01-05.
 */
public class Test {
    public static void main(String[] args) {
        Sourceable source = new Source();
        new Decorator(source).mothod();
    }
}
