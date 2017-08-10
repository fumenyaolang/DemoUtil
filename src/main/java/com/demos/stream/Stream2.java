package com.demos.stream;

import java.io.*;

/**
 * Created by fuzq on 17/8/10.
 */
public class Stream2 {


    public boolean cp(String sourcePath, String targetPath) {
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);
        if (!sourceFile.exists()) {
            PrintUtils.out("源文件不存在");
            return false;
        }
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            InputStream is = new FileInputStream(sourceFile);
            OutputStream os = new FileOutputStream(targetFile);
            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(os);
            int size;
            while ((size = bis.read()) != -1) {
                bos.write(size);
            }
            bos.flush();
            bis.close();
            bos.close();
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    bis = null;
                    PrintUtils.out(e.getMessage());
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    bos = null;
                    PrintUtils.out(e.getMessage());

                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /**
         * file size = 3.27G
         * steam2 exec time=2mi 28s 365ms
         */
        String sourcePath = "/Users/boge/0.iso";
        String targetPath = "/Users/boge/2.iso";
        Stream2 stream2 = new Stream2();
        long start = System.currentTimeMillis();
        boolean flag = stream2.cp(sourcePath, targetPath);
        if (flag) {
            long end = System.currentTimeMillis();
            PrintUtils.out("steam2 exec time=" + DateUtils.fomatLongTime(end - start));
        }
    }

}
