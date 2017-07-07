package com.demos.design.singleton;

/**
 * Created by fumenyaolang on 2015-12-25.
 */
public class Singleton4 {
    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return SingletonFactory.instance;
    }

    public Object readResolve() {
        return getInstance();
    }

    //通过内部类来维护单例，原理是JVM这个类加载的时候线程互斥
    private static class SingletonFactory {
        private static Singleton4 instance = new Singleton4();
    }
}
