package com.demos.design.prototype;

/**
 * Created by fumenyaolang on 2015-12-28.
 */
public class Prototype implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }

}
