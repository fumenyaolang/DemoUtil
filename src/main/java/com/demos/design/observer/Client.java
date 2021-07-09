package com.demos.design.observer;

/**
 * @description: 客户端
 * @author: fmyl
 * @create: 2021-07-09 12:02
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserver1());
        subject.registerObserver(new ConcreteObserver2());
        subject.setState("hello world!!");
        Thread.sleep(1000);
        subject.setState("1");
        Thread.sleep(1000);
        subject.setState("2");
    }
}
