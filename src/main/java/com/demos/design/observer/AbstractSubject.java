package com.demos.design.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by fumenyaolang on 2016-01-12.
 */
public abstract class AbstractSubject implements Subject {
    private Vector<Observer> vector = new Vector<Observer>();

    public void add(Observer observer) {
        vector.add(observer);
    }

    public void del(Observer observer) {
        vector.remove(observer);
    }

    public void notifyObservers() {
        Enumeration<Observer> elements = vector.elements();
        while (elements.hasMoreElements()) {
            elements.nextElement().update();
        }
    }
}
