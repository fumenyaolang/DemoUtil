package com.demos.design.interpreter;

/**
 * Created by fumenyaolang on 2016-01-21.
 */
public class Test {
    public static void main(String[] args) {
        // 计算9+2-8的值
        int result = new Minus().interpreter(new Context(new Plus().interpreter(new Context(9,2)),8));
        System.out.println(result);
    }
}
