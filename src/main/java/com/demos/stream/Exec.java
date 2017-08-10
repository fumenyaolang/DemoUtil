package com.demos.stream;

/**
 * Created by fuzq on 17/8/10.
 */
public class Exec {

    private static String sourcePath = "/Users/boge/0.iso";

    public static void main(String[] args) {
        long start;
        boolean flag;
        String targetPath;
//        Stream1 stream1 = new Stream1();
//        targetPath = "/Users/boge/1.iso";
//        start = System.currentTimeMillis();
//        flag = stream1.cp(sourcePath, targetPath);
//        if (flag) {
//            long end = System.currentTimeMillis();
//            PrintUtils.out("demo1 exec time=" + DateUtils.fomatLongTime(end - start));
//        }

        /**
         * file size = 3.27G
         * steam2 exec time=2mi 22s 227ms
         */
        targetPath = "/Users/boge/2.iso";
        Stream2 stream2 = new Stream2();
        start = System.currentTimeMillis();
        flag = stream2.cp(sourcePath, targetPath);
        if (flag) {
            long end = System.currentTimeMillis();
            PrintUtils.out("steam2 exec time=" + DateUtils.fomatLongTime(end - start));
        }

        /**
         * file size = 3.27G
         * steam3 exec time=18s 990ms
         */
        targetPath = "/Users/boge/3.iso";
        Stream3 stream3 = new Stream3();
         start = System.currentTimeMillis();
         flag = stream3.cp(sourcePath, targetPath);
        if (flag) {
            long end = System.currentTimeMillis();
            PrintUtils.out("steam3 exec time=" + DateUtils.fomatLongTime(end - start));
        }

        /**
         * file size = 3.27G
         * steam4 exec time=6s 747ms
         */
        targetPath = "/Users/boge/4.iso";
        Stream4 stream4 = new Stream4();
        start = System.currentTimeMillis();
        flag = stream4.cp(sourcePath, targetPath);
        if (flag) {
            long end = System.currentTimeMillis();
            PrintUtils.out("steam4 exec time=" + DateUtils.fomatLongTime(end - start));
        }
    }
}
