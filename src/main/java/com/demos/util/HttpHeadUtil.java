package com.demos.util;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by fumenyaolang on 2015-12-11.
 */
public class HttpHeadUtil {

    public static void showHeadInfo(HttpServletRequest request) {
        //headerName
        System.out.println("[ headerName ]");
        Enumeration hn = request.getHeaderNames();
        //LogUtil.enumLog(hn);//log
        List<String> headerNames = ChangeTypeUtil.enum2List(hn);
        int i = 0;
        for (String headerName : headerNames) {
            System.out.println(i++ + "   " + headerName + " : " + request.getHeader(headerName));
        }

        //parameter
        System.out.println("[ parameter ]");
        Map parameterMap = request.getParameterMap();
        //LogUtil.mapLog(parameterMap, 0);
        Set<Map.Entry<String, String[]>> set = parameterMap.entrySet();
        for (Map.Entry<String, String[]> entry : set) {
            String key = entry.getKey();
            StringBuffer sb = new StringBuffer();
            String[] val = entry.getValue();
            for (int n = 0; n < val.length; n++) {
                sb.append(val[n] + ", ");
            }
            System.out.println(key + " : " + sb.toString());

        }
    }
}
