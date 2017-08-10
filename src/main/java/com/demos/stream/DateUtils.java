package com.demos.stream;

/**
 * Created by fuzq on 17/8/10.
 */
public class DateUtils {

    public static String fomatLongTime(long time) {
        String result = "";
        long ms, s, mi, h;
        ms = time % 1000;
        result = ms + "ms ";
        if (time / 1000 > 0) {
            s = time / 1000 % 60;
            result = s + "s " + result;
            if (time / 1000 / 60 > 0) {
                mi = time / 1000 / 60 % 60;
                result = mi + "mi " + result;
                if (time / 1000 / 60 / 60 > 0) {
                    h = time / 1000 / 60 / 60;
                    result = h + "h " + result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(DateUtils.fomatLongTime(1000*60*60));
    }
}
