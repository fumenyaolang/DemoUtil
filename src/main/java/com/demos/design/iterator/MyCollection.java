package com.demos.design.iterator;

/**
 * Created by fumenyaolang on 2016-01-19.
 */
public class MyCollection implements Collection {

    private String[] string = {"A", "B", "C", "D", "E", "F", "G"};

    public Iterator iterator() {
        return new MyIterator(this);
    }

    public Object get(int i) {
        return this.string[i];
    }

    public int size() {
        return this.string.length;
    }
}
