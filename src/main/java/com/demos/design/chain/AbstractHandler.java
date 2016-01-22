package com.demos.design.chain;

/**
 * Created by fumenyaolang on 2016-01-20.
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
