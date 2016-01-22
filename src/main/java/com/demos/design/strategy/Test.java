package com.demos.design.strategy;

/**
 * Created by fumenyaolang on 2016-01-12.
 */
public class Test {

    public static void main(String[] args) {
        String exp = "2+4";
        ICalculator calc = new Plus();//策略模式
        System.out.println(calc.calculate(exp));
    }
}
