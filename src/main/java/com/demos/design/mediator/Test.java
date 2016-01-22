package com.demos.design.mediator;

/**
 * Created by fumenyaolang on 2016-01-21.
 */
public class Test {

    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.allWork();

    }
}
