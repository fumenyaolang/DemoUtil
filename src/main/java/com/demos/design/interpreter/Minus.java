package com.demos.design.interpreter;

/**
 * Created by fumenyaolang on 2016-01-21.
 */
public class Minus implements Expression {
    
    public int interpreter(Context context) {
        return context.getNum1() - context.getNum2();
    }
}
