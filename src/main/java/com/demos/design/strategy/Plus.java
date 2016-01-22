package com.demos.design.strategy;

/**
 * plus
 * Created by fumenyaolang on 2016-01-12.
 */
public class Plus extends AbstractCalculator implements ICalculator {

    public int calculate(String exp) {
        int[] arrayInt = split(exp, "\\+");
        return arrayInt[0] + arrayInt[1];
    }

}
