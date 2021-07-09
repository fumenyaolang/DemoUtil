package com.demos.design.observer;

/**
 * 观察者模式的观察者
 * 该接口是观察者的抽象，定义了主体通知的动作
 */
public interface Observer {
    void update(ConcreteSubject subject);
}
