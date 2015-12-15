package com.demos.util;

import sun.applet.Main;

import java.util.*;

/**
 * Created by fumenyaolang on 2015-12-10.
 */
public class LogUtil {
    /**
     * List value log
     */
    public static void listLog(List l) {
        if (l == null)
            return;
        System.out.println(l.getClass().getName() + " : ");
        for (int i = 0; i < l.size(); i++) {
            System.out.println("        " + i + " : " + l.get(i));
        }
    }

    /**
     * Enumeration value log
     */
    public static void enumLog(Enumeration e) {
        if (e == null)
            return;
        System.out.println(e.getClass().getName() + " :");
        int i = 0;
        while (e.hasMoreElements()) {
            System.out.println("        " + i++ + " : " + e.nextElement().toString());
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
                System.out.println("method one");
                Set<String> set = map.keySet();
                for (String key : set) {
                    System.out.println("key : " + key + "; value : " + map.get(key));
                }
                break;
            case 1://方法二
                System.out.println("method two");
                Iterator iter = map.entrySet().iterator();
                while (iter.hasNext()) {
                    Map.Entry obj = (Map.Entry) iter.next();
                    System.out.println("key : " + obj.getKey() + "; value : " + obj.getValue());
                }
                break;
            case 2://方法三
                System.out.println("method three");
                Set<Map.Entry> entrySet = map.entrySet();
                for (Map.Entry entry : entrySet) {
                    System.out.println("key : " + entry.getKey() + "; value : " + entry.getValue());
                }
                break;
            case 3://方法四
                System.out.println("method four");
                Iterator iter2 = map.values().iterator();
                int i = 0;
                while (iter2.hasNext()) {
                    System.out.println(i++ + " ; value : " + iter2.next());
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
