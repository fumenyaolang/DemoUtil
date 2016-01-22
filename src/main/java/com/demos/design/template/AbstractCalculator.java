package com.demos.design.template;

/**
 * Created by fumenyaolang on 2016-01-12.
 */
public abstract class AbstractCalculator {

    public int calculate(String exp,String regex){
        int[] arrayInt = split(exp,regex);
        return catculate(arrayInt[0],arrayInt[1]);
    }

    protected abstract int catculate(int i, int j);

    public int[] split(String exp, String regex) {
        String[] array = exp.split(regex);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
