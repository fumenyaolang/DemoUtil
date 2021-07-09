package com.demos.design2.adapter;

/**
 * 适配器模式（adapter pattern）【电脑/网线/适配器】
 * 该类为电脑
 *
 * @author: fmyl
 * @create: 2021-02-08 15:25
 */
public class Computer {

    public void viewData(Adaptor adaptor){
        System.out.println("view data");
    }

    public static void main(String[] args) {
//        Computer computer = new concrete();
//        Adaptor adaptor = new Adaptor();
//        computer.viewData(adaptor);
    }
}
