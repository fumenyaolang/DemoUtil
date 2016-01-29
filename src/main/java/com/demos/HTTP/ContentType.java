package com.demos.HTTP;

import com.demos.util.LogUtil;

/**
 * Created by fumenyaolang on 2016-01-27.
 */
public enum ContentType {
    HTML("html", "text/html"),
    HTM("htm", "text/html"),
    JPG("jpg", "image/jpeg"),
    JPEG("jpeg", "image/jpeg"),
    GIG("gif", "image/gif");

    private String value;
    private String type;

    ContentType(String value, String type) {
        this.value = value;
        this.type = type;
    }

    public static void main(String[] args) {
        ContentType[] contentTypes = ContentType.values();
        for (int i = 0; i < contentTypes.length; i++) {
            ContentType t = contentTypes[i];
            LogUtil.out(t.getValue() + "       " + t.getType());
        }
    }

    public static String getTypeByValue(String value) {
        ContentType[] contentTypes = ContentType.values();
        for (int i = 0; i < contentTypes.length; i++) {
            ContentType t = contentTypes[i];
            if (t.getValue().equals(value)) {
                return t.getType();
            }
        }
        return "application/octet-stream";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
