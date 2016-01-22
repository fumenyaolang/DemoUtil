package com.demos.design.state;

/**
 * Created by fumenyaolang on 2016-01-21.
 */
public class Test {

    public static void main(String[] args) {
        State state = new State();
        Context context = new Context(state);

        state.setValue("open");
        context.method();

        state.setValue("off");
        context.method();
    }
}
