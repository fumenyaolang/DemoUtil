package com.demos.design.bridge;

/**
 * Created by fumenyaolang on 2016-01-07.
 */
public class Client {
    public static void main(String[] args) {
        bridge bridge = new MyBridge();

        bridge.setSource(new SourceSub1());
        bridge.method();

        bridge.setSource(new SourceSub2());
        bridge.method();
    }
}
