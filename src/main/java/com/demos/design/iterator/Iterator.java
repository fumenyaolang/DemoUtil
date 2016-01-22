package com.demos.design.iterator;

/**
 * 迭代子模式
 * Created by fumenyaolang on 2016-01-19.
 */
public interface Iterator {

    //向前
    public Object previous();

    //向后
    public Object next();

    public boolean hasNext();

    //跳到第一个
    public Object first();

}
