package com.demos.design.singleton;

/**
 * Created by fumenyaolang on 2015-12-25.
 */
public class Singleton3 {
    private static Singleton3 instance = null;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (instance) { //既线程安全、又降低了同步锁产生的性能问题；但是在JVM中还是有可能出现问题，
                                        //由于java赋值和创建对象是分开的，所以就可能在多线程的情况下出现问题
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

    public Object readResolve() {
        return instance;
    }
}
