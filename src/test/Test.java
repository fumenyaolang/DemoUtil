import com.demos.util.LogUtil;

import java.io.InputStream;

/**
 * Created by fumenyaolang on 2015-12-18.
 */
public class Test {
    public static void main(String[] args) {
        String s = "index.html";
        String[] split = s.split("\\.");
        LogUtil.out(split.length);


    }
}
