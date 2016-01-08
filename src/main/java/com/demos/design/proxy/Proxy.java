package com.demos.design.proxy;

/**
 * Created by fumenyaolang on 2016-01-05.
 */
public class Proxy implements Sourceable {

    private Sourceable source = null;//延迟加载

    public void method() {
        before();
        if (source == null)
            source = new Source();
        source.method();
        after();
    }

    private void before() {
        System.out.println("before");
    }

    private void after() {
        System.out.println("after");
    }
}
