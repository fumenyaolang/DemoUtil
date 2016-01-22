package com.demos.design.observer;

/**
 * Created by fumenyaolang on 2016-01-12.
 */
public interface Subject {
    public void add(Observer observer);

    public void del(Observer observer);

    public void notifyObservers();

    public void operation();

}
