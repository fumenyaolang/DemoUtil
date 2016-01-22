package com.demos.design.memento;

/**
 * 备忘录模式
 * Created by fumenyaolang on 2016-01-20.
 */
public class Memento {
    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
