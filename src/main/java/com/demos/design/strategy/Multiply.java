package com.demos.design.strategy;

/**
 * multiply
 * Created by fumenyaolang on 2016-01-12.
 */
public class Multiply extends AbstractCalculator implements ICalculator {

    public int calculate(String exp) {
        int[] arrayInt = split(exp, "\\*");
        return arrayInt[0] * arrayInt[1];

    }

}
