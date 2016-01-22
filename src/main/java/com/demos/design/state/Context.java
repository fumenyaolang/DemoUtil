package com.demos.design.state;

/**
 * Created by fumenyaolang on 2016-01-21.
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void method() {
        String value = state.getValue();
        if ("open".equals(value)) {
            state.method1();
        }
        if ("off".equals(value)) {
            state.method2();
        }
    }
}
