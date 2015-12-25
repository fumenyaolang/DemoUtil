package com.demos.design.factory2;

/**
 * Created by fumenyaolang on 2015-12-23.
 */
public class SmsSender implements Sender {
    public void send() {
        System.out.println("This is sms sender");
    }
}
