package com.demos.design.mediator;

/**
 * Created by fumenyaolang on 2016-01-21.
 */
public class User2 extends User {
    
    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("User2 work");
    }
}
