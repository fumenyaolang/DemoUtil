package com.demos.design.adapter3;

/**
 * Created by fumenyaolang on 2016-01-04.
 */
public class Test {
    public static void main(String[] args) {
        TargetInterface target1 = new SourceSub1();
        TargetInterface target2 = new SourceSub2();

        target1.mothod1();
        target1.mothod2();
        target2.mothod1();
        target2.mothod2();
    }
}
