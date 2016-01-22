package com.demos.design.strategy;

/**
 * Created by fumenyaolang on 2016-01-12.
 */
public abstract class AbstractCalculator {

    public int[] split(String exp, String regex) {
        String[] arrays = exp.split(regex);
        int[] arrayInt = new int[2];
        arrayInt[0] = Integer.parseInt(arrays[0]);
        arrayInt[1] = Integer.parseInt(arrays[1]);
        return arrayInt;
    }
}
