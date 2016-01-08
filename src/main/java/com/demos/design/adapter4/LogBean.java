package com.demos.design.adapter4;

/**
 * Created by fumenyaolang on 2016-01-04.
 */
public class LogBean {
    private String logId;
    private String operUserId;//操作人员

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getOperUserId() {
        return operUserId;
    }

    public void setOperUserId(String operUserId) {
        this.operUserId = operUserId;
    }

    public String toString() {
        return "logId=" + logId + "operUserId=" + operUserId;
    }

}
