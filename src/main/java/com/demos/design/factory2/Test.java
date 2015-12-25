package com.demos.design.factory2;

/**
 * Created by fumenyaolang on 2015-12-23.
 */
public class Test {
    public static void main(String[] args) {
        Provider provider = new MailSenderFactory();
        Sender sender = provider.produce();
        sender.send();
    }

}
