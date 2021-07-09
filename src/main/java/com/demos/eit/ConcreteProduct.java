package com.demos.eit;

/**
 * @description: 具体产品
 * @author: fmyl
 * @create: 2021-07-08 11:16
 */
public class ConcreteProduct extends Product{

    @Override
    protected String hookMethod() {
        return "11";
    }
}
