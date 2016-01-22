package com.demos.design.command;

/**
 * Created by fumenyaolang on 2016-01-20.
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new MyCommand(receiver);
        Invoker invoker = new Invoker(command);

        invoker.exec();
    }
}
