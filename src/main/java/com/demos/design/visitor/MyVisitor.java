package com.demos.design.visitor;

/**
 * Created by fumenyaolang on 2016-01-21.
 */
public class MyVisitor implements Visitor {

    public void visit(Subject subject) {
        System.out.println("visit the subject: " + subject.getSubject());
    }
}
