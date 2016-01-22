package com.demos.design.iterator;

/**
 * Created by fumenyaolang on 2016-01-19.
 */
public class MyIterator implements Iterator {

    private Collection collection;
    private int pos = -1;

    public MyIterator(Collection collection) {
        this.collection = collection;
    }

    public Object previous() {
        if (pos > 0) {
            pos--;
        } else {
            return this.first();
        }
        return collection.get(pos);
    }

    public Object next() {
        if (pos < collection.size() - 1) {
            pos++;
        }
        return collection.get(pos);
    }

    public boolean hasNext() {
        return collection.size() - pos > 1;
    }

    public Object first() {
        if (collection.size() < 1) {
            return null;
        }
        pos = 0;
        return collection.get(pos);
    }
}
