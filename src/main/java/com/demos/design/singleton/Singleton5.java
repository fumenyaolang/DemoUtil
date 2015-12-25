package com.demos.design.singleton;

/**
 * Created by fumenyaolang on 2015-12-25.
 */
public class Singleton5 {
    private static Singleton5 instance = null;

    private Singleton5() {
    }

    /* TODO 能解决 Singleton3的问题吗？@see Singleton3 */
    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new Singleton5();
        }
    }

    public static Singleton5 getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }

    public Object readResolve() {
        return instance;
    }
}
