package com.demos.design.factory;

/**
 * Created by fumenyaolang on 2015-12-23.
 */
public class Test {
    public static void main(String[] args) {
        // test  way one
//        SendFactory factory = new SendFactory();
//        Sender sender = factory.produce("sms");
//        sender.send();

        //test way two
//        SendFactory factory = new SendFactory();
//        Sender mailSender = factory.produceMail();
//        mailSender.send();

        //test way three
        Sender sender = SendFactory.produceSms2();
        sender.send();
    }

}
