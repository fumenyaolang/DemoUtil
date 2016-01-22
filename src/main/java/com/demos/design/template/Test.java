package com.demos.design.template;

/**
 * Created by fumenyaolang on 2016-01-12.
 */
public class Test {
    public static void main(String[] args) {
        String exp = "4+6";
        AbstractCalculator calc = new Plus();
        System.out.println(calc.calculate(exp, "\\+"));
    }
}
