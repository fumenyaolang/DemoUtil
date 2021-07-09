package com.demos.eit;

/**
 * @description: 实现创造工厂
 * @author: fmyl
 * @create: 2021-07-08 11:13
 */
public class ConcreteClient extends Creater {
    @Override
    protected String factoryMethod() {
        return new ConcreteProduct().hookMethod();
    }

    public static void main(String[] args) {
        Creater creater = new ConcreteClient();
        String s = creater.factoryMethod();
        System.out.println(s);
    }
}
