package com.demos.design.adapter4;

import org.apache.commons.lang.StringUtils;

import java.util.List;

/**
 * Created by fumenyaolang on 2016-01-04.
 */
public class LogFileOperate implements LogFileOperateApi {

    private String logFileName = "file.log";

    public LogFileOperate(String logFileName) {
        if (StringUtils.isNotBlank(logFileName)) logFileName = this.logFileName;
    }

    public List<LogBean> readLog() {

        return null;
    }

    public void writeLogFile(List<LogBean> list) {

    }
}
