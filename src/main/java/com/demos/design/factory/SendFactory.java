package com.demos.design.factory;

/**
 * factory
 * Created by fumenyaolang on 2015-12-23.
 *  普通工厂模式 （该方法为普通工厂模式）
 *
 *  抽象工厂模式
 */
public class SendFactory {

    /*
        way one
     */
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("type is wrong");
        }
        return null;
    }

    /*
        way two
     */
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }

    /*
     way three
    */
    public static Sender produceSms2() {
        return new SmsSender();
    }

    public static Sender produceMail2() {
        return new MailSender();
    }
}
