package com.demos.design.mediator;

/**
 * Created by fumenyaolang on 2016-01-21.
 */
public class MyMediator implements Mediator {

    private User user1;
    private User user2;

    public void createMediator() {
        user1 = new User1(this);
        user2 = new User2(this);
    }

    public void allWork() {
        user1.work();
        user2.work();
    }
}
