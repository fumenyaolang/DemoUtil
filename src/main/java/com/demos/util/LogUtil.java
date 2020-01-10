package com.demos.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * Created by fumenyaolang on 2015-12-10.
 */
public class LogUtil {

    public static void out(Object log) {
        System.out.println(log);
    }

    /**
     * List value log
     */
    public static void listLog(List l) {
        if (l == null)
            return;
        out(l.getClass().getName() + " : ");
        for (int i = 0; i < l.size(); i++) {
            out("        " + i + " : " + l.get(i));
        }
    }

    /**
     * Enumeration value log
     */
    public static void enumLog(Enumeration e) {
        if (e == null)
            return;
        out(e.getClass().getName() + " :");
        int i = 0;
        while (e.hasMoreElements()) {
            out("        " + i++ + " : " + e.nextElement().toString());
        }
    }

    public static void inputStreamLog(InputStream in) throws IOException {
        if (in == null) {
            out("inputStream is null!!");
            return;
        }
        int len = 0;
        byte[] buffer = new byte[128];
        out(in + " : /r/n");
        while ((len = in.read(buffer)) != -1) {
            out(in.read());
        }
    }

    /**
     * Map key value log
     *
     * @param map
     * @param m   [1]   method 1:
     *            map.keySet()
     *            map.get(key)
     *            [2]  method 2:
     *            Iterator iter = map.entrySet().iterator();
     *            while(iter.hasNext()){.....}
     *            [3]  method 3:
     *            for(Map.Entry entry:map.entrySet()){......}
     *            [4]  method 4:
     *            Iterator iter2 = map.values().iterator();
     *            while(iter2.hasNext()){....}
     */
    public static void mapLog(Map map, Integer m) {
        if (m == null)
            m = 0;
        if (map == null)
            return;
        switch (m) {
            case 0://方法一
                out("method one");
                Set<String> set = map.keySet();
                for (String key : set) {
                    out("key : " + key + "; value : " + map.get(key));
                }
                break;
            case 1://方法二
                out("method two");
                Iterator iter = map.entrySet().iterator();
                while (iter.hasNext()) {
                    Map.Entry obj = (Map.Entry) iter.next();
                    out("key : " + obj.getKey() + "; value : " + obj.getValue());
                }
                break;
            case 2://方法三
                out("method three");
                Set<Map.Entry> entrySet = map.entrySet();
                for (Map.Entry entry : entrySet) {
                    out("key : " + entry.getKey() + "; value : " + entry.getValue());
                }
                break;
            case 3://方法四
                out("method four");
                Iterator iter2 = map.values().iterator();
                int i = 0;
                while (iter2.hasNext()) {
                    out(i++ + " ; value : " + iter2.next());
                }
                break;
        }
    }

    //test
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("s1", 1);
        map.put("s3", 3);
        map.put("s2", 2);
        LogUtil.mapLog(map, 0);
        LogUtil.mapLog(map, 1);
        LogUtil.mapLog(map, 2);
        LogUtil.mapLog(map, 3);
    }
}
