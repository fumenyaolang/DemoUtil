package com.demos.design.bridge;

/**
 * Created by fumenyaolang on 2016-01-07.
 */
//TODO abstract why?
public abstract class bridge {
    private Sourceable source;

    public void method() {
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
