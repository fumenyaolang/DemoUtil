package com.demos.design.observer;

/**
 * @description: 观察者实现类2
 * @author: fmyl
 * @create: 2021-07-09 11:56
 */
public class ConcreteObserver2 implements Observer {
    @Override
    public void update(ConcreteSubject subject) {
        System.out.println("concrete observer 2 print --> " + subject.getState());
    }
}
