package com.demos.design.mediator;

/**
 * Created by fumenyaolang on 2016-01-21.
 */
public class User1 extends User {

    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("User1 woke");
    }
}
