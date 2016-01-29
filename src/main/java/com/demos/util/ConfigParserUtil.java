package com.demos.util;

import java.net.URL;

/**
 * Created by fumenyaolang on 2016-01-25.
 */
public class ConfigParserUtil {

    public static void main(String[] args) {
        URL url = ConfigParserUtil.class.getResource("/index.html");
        System.out.println(url.getPath());
    }

}
