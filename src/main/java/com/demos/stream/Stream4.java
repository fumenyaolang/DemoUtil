package com.demos.stream;

import java.io.*;

/**
 * Created by fuzq on 17/8/10.
 */
public class Stream4 {


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
            byte[] buffer = new byte[512];
            int size;
            while ((size = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, size);
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
         * steam4 exec time=10s 59ms
         */
        String sourcePath = "/Users/boge/0.iso";
        String targetPath = "/Users/boge/4.iso";
        Stream4 stream4 = new Stream4();
        long start = System.currentTimeMillis();
        boolean flag = stream4.cp(sourcePath, targetPath);
        if (flag) {
            long end = System.currentTimeMillis();
            PrintUtils.out("steam4 exec time=" + DateUtils.fomatLongTime(end - start));
        }
    }
}
