package com.demos.design.visitor;

/**
 * Created by fumenyaolang on 2016-01-21.
 */
public interface Subject {
    
    public void accept(Visitor visitor);

    public String getSubject();
}
