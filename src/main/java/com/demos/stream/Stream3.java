package com.demos.stream;

import java.io.*;

/**
 * Created by fuzq on 17/8/10.
 */
public class Stream3 {


    public boolean cp(String sourcePath, String targetPath) {
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);
        if (!sourceFile.exists()) {
            PrintUtils.out("源文件不存在");
            return false;
        }
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(sourceFile);
            os = new FileOutputStream(targetFile);
            byte[] buffer = new byte[512];
            int size;
            while ((size = is.read(buffer)) != -1) {
                os.write(buffer, 0, size);
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
                    PrintUtils.out(e.getMessage());
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    os = null;
                    PrintUtils.out(e.getMessage());
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /**
         * file size = 3.27G
         * steam3 exec time=21s 580ms
         */
        String sourcePath = "/Users/boge/0.iso";
        String targetPath = "/Users/boge/3.iso";
        Stream3 stream3 = new Stream3();
        long start = System.currentTimeMillis();
        boolean flag = stream3.cp(sourcePath, targetPath);
        if (flag) {
            long end = System.currentTimeMillis();
            PrintUtils.out("steam3 exec time=" + DateUtils.fomatLongTime(end - start));
        }
    }
}
