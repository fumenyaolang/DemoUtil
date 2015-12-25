package com.demos.design.factory2;

/**
 * Created by fumenyaolang on 2015-12-23.
 */
public class MailSenderFactory implements Provider{
    public Sender produce() {
        return new MailSender();
    }
}
