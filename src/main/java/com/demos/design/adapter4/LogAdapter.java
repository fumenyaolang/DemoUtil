package com.demos.design.adapter4;

import java.util.List;

/**
 * Created by fumenyaolang on 2016-01-04.
 */
public class LogAdapter implements LogDbOperApi {
    private LogFileOperateApi adaptee;

    public LogAdapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    public void createLog(LogBean logBean) {
        List<LogBean> list = adaptee.readLog();
        list.add(logBean);
        adaptee.writeLogFile(list);
    }

}
