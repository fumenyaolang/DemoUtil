package com.demos.design.observer;

/**
 * Created by fumenyaolang on 2016-01-12.
 */
public class MySubject extends AbstractSubject{

    public void operation() {
        System.out.println("update self");
        notifyObservers();
    }

}
