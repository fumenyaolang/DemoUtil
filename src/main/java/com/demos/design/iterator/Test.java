package com.demos.design.iterator;

/**
 * Created by fumenyaolang on 2016-01-19.
 */
public class Test {
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator iterator = collection.iterator();
        System.out.println(iterator.previous());
        System.out.println("first:" + iterator.first());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
