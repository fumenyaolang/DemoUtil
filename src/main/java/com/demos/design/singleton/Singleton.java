package com.demos.design.singleton;

/**
 * Singleton Patterns :
 * Created by fumenyaolang on 2015-12-24.
 */
public class Singleton {
    // private 私有 防止访问
    // static
    // null 延迟加载
    private static Singleton instance = null;

    // private 防止被实例化
    private Singleton() {
    }

    //静态方法 create instance
    public static Singleton getInstance() {//线程不安全
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    //如果对象被序列化，可以保证序列的实例前后一致
    //TODO 序列化 、readResolve
    public Object readResolve() {
        return instance;
    }
}
