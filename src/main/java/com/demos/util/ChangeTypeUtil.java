package com.demos.util;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by fumenyaolang on 2015-12-10.
 */
public class ChangeTypeUtil {
    /**
     * Enumeration to List
     */
    public static List enum2List(Enumeration e) {
        List l = new ArrayList();
        if (e == null)
            return null;
        while (e.hasMoreElements())
            l.add(e.nextElement());
        return l;
    }
}
