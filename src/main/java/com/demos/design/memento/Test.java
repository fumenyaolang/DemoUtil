package com.demos.design.memento;

/**
 * Created by fumenyaolang on 2016-01-20.
 */
public class Test {
    public static void main(String[] args) {

        Original original = new Original("egg");

        Storage storage = new Storage(original.createMemento());

        System.out.println("start:" + original.getValue());
        original.setValue("new");
        System.out.println("change:" + original.getValue());

        original.restoreMemento(storage.getMemento());
        System.out.println("restore:" + original.getValue());
    }
}
