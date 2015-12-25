package com.demos.design.singleton;

/**
 * Created by fumenyaolang on 2015-12-25.
 */
public class Singleton2 {
    private static Singleton2 instance = null;

    private Singleton2() {
    }

    //TODO synchronized ??
    public static synchronized Singleton2 getInstance() {//线程安全、但是性能比较低
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    public Object readResolve() {
        return instance;
    }


}
