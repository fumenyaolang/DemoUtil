package com.demos.stream;

import java.io.*;

/**
 * Created by fuzq on 17/8/10.
 */
public class Stream1 {

    public boolean cp(String sourcePath, String targetPath) {
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);
        if (!sourceFile.exists()) {
            PrintUtils.out("文件不存在");
            return false;
        }
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(sourceFile);
            os = new FileOutputStream(targetFile);
            int i;
            while ((i = is.read()) != -1) {
                os.write(i);
            }
            is.close();
            os.close();
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    is = null;
                }
                is = null;
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    os = null;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        /**
         * file size = 3.27G
         * demo1 exec time=6702705
         * demo1 exec time=1h 51mi 42s 705ms
         */
        Stream1 stream = new Stream1();
        String sourcePath = "/Users/boge/0.iso";
        String targetPath = "/Users/boge/1.iso";
        long start = System.currentTimeMillis();
        boolean flag = stream.cp(sourcePath, targetPath);
        if (flag) {
            long end = System.currentTimeMillis();
            PrintUtils.out("demo1 exec time=" + DateUtils.fomatLongTime(end - start));
        }
    }


}
