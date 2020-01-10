package com.demos.util;

import java.util.Random;

/**
 * 本地线程
 *
 * @author fmyl
 * @date 2019/2/21 3:00 PM
 */
public class LocalThread {


    private static class Local {
        private static ThreadLocal<Log> localThread = new ThreadLocal<Log>() {
            @Override
            protected Log initialValue() {
                return new Log();
            }
        };
    }

    public static void main(String[] args) {
        int i = 20;
        while (i-- > 0) {
            new Thread(new Runnable() {
                public void run() {
                    Log log = Local.localThread.get();
                    Random random = new Random();
                    log.setPath("asdf" + random.nextInt(100000));
                    System.out.println(log);
                    System.out.println(Thread.currentThread().getName());
                }
            }).run();
        }

    }
}

class Log {
    private String path;
    private String code;

    public Log() {
        this.path = "";
        this.code = Thread.currentThread().getName();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Log{" +
                "path='" + path + '\'' +
                ", code=" + code +
                '}';
    }
}
