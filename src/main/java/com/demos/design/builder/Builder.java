package com.demos.design.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式
 * Created by fumenyaolang on 2015-12-28.
 */
public class Builder {
    private List<Sender> senders = new ArrayList<Sender>();

    public List<Sender> produceMailSender(int count) {
        for (int i = 0; count > i; i++) {
            senders.add(new MailSender());
        }
        return senders;
    }

    public List<Sender> produceSmsSender(int count) {
        for (int i = 0; count > i; i++) {
            senders.add(new SmsSender());
        }
        return senders;
    }
}
