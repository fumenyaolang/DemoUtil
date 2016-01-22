package com.demos.design.mediator;

/**
 * Created by fumenyaolang on 2016-01-21.
 */
public abstract class User {

    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
