package com.demos.design.observer;


/**
 * 观察者模式又叫做发布/订阅模式、数据/视图模式
 * 观察者模式的主体接口，
 * 决定了观察者的装配逻辑
 */
public interface Subject {

    /**
     * 注册观察者
     *
     * @param o
     */
    void registerObserver(Observer o);

    /**
     * 移除观察者
     *
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * 通知所有观察者
     */
    void notifyObservers();
}
