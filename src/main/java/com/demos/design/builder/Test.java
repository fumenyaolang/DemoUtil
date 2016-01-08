package com.demos.design.builder;

import java.util.List;

/**
 * Created by fumenyaolang on 2015-12-28.
 */
public class Test {
    public static void main(String[] args) {
        Builder builder = new Builder();
        List<Sender> senders = builder.produceMailSender(10);
        System.out.println(senders.size());

    }
}
