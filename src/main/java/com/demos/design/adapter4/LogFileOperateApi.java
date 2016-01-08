package com.demos.design.adapter4;

import java.util.List;

/**
 * Created by fumenyaolang on 2016-01-04.
 */
public interface LogFileOperateApi {

    public List<LogBean> readLog();

    public void writeLogFile(List<LogBean> list);

}
