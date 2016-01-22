package com.demos.design.visitor;

/**
 * Created by fumenyaolang on 2016-01-21.
 */
public class MySubject implements Subject {

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getSubject() {
        return "love";
    }
}
