package com.demos.design.factory2;

/**
 * Created by fumenyaolang on 2015-12-23.
 */
public class SmsSenderFactory implements Provider {
    public Sender produce() {
        return new SmsSender();
    }
}
