package com.demos.design.iterator;

/**
 * Created by fumenyaolang on 2016-01-19.
 */
public interface Collection {

    public Iterator iterator();

    public Object get(int i);

    public int size();
}
