package com.demos.design.builder;

/**
 * Created by fumenyaolang on 2015-12-28.
 */
public class MailSender implements Sender {
    public void send() {
        System.out.println("this is mail sender");
    }
}
