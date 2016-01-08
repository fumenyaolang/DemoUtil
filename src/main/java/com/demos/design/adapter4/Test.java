package com.demos.design.adapter4;

/**
 * Created by fumenyaolang on 2016-01-04.
 */
public class Test {
    public static void main(String[] args) {
        LogBean logBean = new LogBean();
        LogFileOperateApi apadtee = new LogFileOperate("");
        LogDbOperApi api = new LogAdapter(apadtee);
        api.createLog(logBean);
    }
}
