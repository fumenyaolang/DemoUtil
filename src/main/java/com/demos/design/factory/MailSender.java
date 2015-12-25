package com.demos.design.factory;

/**
 * Created by fumenyaolang on 2015-12-23.
 */
public class MailSender implements Sender {

    public void send() {
        System.out.println("This is mail sender");
    }
}
