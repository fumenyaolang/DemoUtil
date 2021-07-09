package com.demos.design.observer;

import java.util.ArrayList;

/**
 * @description: 观察模式的主体接口的具体实现
 * @author: fmyl
 * @create: 2021-07-09 11:15
 */
public class ConcreteSubject implements Subject {

    /**
     * 需要传递的state
     */
    private String state;
    /**
     * 观察者的集合
     */
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        if (observers.size() < 1) {
            return;
        }
        observers.forEach(observer -> observer.update(this));
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        /**
         * 状态变化，调用通知消息方法
         */
        notifyObservers();
    }
}
