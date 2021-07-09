package com.demos.design2.adapter;

/**
 * 适配器模式（adapter pattern）【电脑/网线/适配器】
 * 需要被适配的类：网线
 *
 * @author: fmyl
 * @create: 2021-02-08 15:50
 */
public class Adaptee {

    public void request() {
        System.out.println("connection network");
    }
}
