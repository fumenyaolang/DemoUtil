import com.demos.util.LogUtil;

import java.io.InputStream;

/**
 * Created by fumenyaolang on 2015-12-18.
 */
public class Test {
    public static void main(String[] args) {
        InputStream in = Test.class.getResourceAsStream("../webapp/test.html");
        LogUtil.out(in);
    }
}
