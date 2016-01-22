package com.demos.design.command;

/**
 * Created by fumenyaolang on 2016-01-20.
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void exec() {
        receiver.action();
    }
}
