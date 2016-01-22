package com.demos.design.observer;

/**
 * Created by fumenyaolang on 2016-01-12.
 */
public class Test {

    public static void main(String[] args) {
        Subject subject = new MySubject();
        subject.add(new Observer1());
        subject.add(new Observer2());
        subject.operation();
    }

}