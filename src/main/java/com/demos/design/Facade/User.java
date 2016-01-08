package com.demos.design.Facade;

/**
 * Created by fumenyaolang on 2016-01-06.
 */
public class User {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
