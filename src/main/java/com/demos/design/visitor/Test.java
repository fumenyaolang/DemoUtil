package com.demos.design.visitor;

/**
 * Created by fumenyaolang on 2016-01-21.
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new MySubject();
        Visitor visitor = new MyVisitor();
        subject.accept(visitor);
    }
}
