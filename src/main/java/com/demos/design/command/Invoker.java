package com.demos.design.command;

/**
 * 调用者
 * Created by fumenyaolang on 2016-01-20.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void exec() {
        command.exec();
    }
}
