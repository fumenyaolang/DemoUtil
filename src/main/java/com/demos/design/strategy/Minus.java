package com.demos.design.strategy;

/**
 * minus
 * Created by fumenyaolang on 2016-01-12.
 */
public class Minus extends AbstractCalculator implements ICalculator {

    public int calculate(String exp) {
        int[] arrayInt = split(exp, "-");
        return arrayInt[0] - arrayInt[1];
    }

}
