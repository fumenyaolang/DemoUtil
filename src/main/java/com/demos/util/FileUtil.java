package com.demos.util;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by fumenyaolang on 2015-12-15.
 */
public class FileUtil {

    /**
     * InputStream inro file
     *
     * @param in
     * @param outFilePath file path
     */
    public static void inStream2File(InputStream in, String outFilePath) {
//        File file =new File(outFilePath);
//        OutputStream out = new FileOutputStream(file);
    }


    public static void rename(String filePath, String newFileName) {
        File file = new File(filePath);
        String path = filePath.substring(0, filePath.lastIndexOf(File.separatorChar));
        file.renameTo(new File(path + File.separatorChar + newFileName));
    }

    public static void showInfo(String filePath) throws IOException {
        File file = new File(filePath);
        System.out.println("size            :" + file.length());
        FileInputStream fis = new FileInputStream(file);
        System.out.println("file info stream:" + fis.available());
    }

    public static void copy(String filePath, String newFileName) {
        final String basePath = filePath.substring(0, filePath.lastIndexOf(File.separatorChar));
        long now = System.currentTimeMillis();
        File file = new File(filePath);
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
            fos = new FileOutputStream(basePath + File.separatorChar + newFileName);
            fis = new FileInputStream(file);
            byte[] types = new byte[1024];
            int len;
            while ((len = fis.read(types)) != -1) {
                fos.write(types, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    fis = null;
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    fos = null;
                    e.printStackTrace();
                }
            }
        }
        System.out.println("time: " + (System.currentTimeMillis() - now) / 1000 + "s");
    }

    public static void loadFileSync(final String urlPath) {
        new Thread(new Runnable() {
            public void run() {
                System.out.println("upload " + urlPath + " start");
                FileUtil.loadFile(urlPath);
            }
        }).start();
    }

    public static void loadFile(String urlPath) {
        long now = System.currentTimeMillis();
        final String path = "/Users/fumenyaolang/Desktop/gbj";
        final String name = urlPath.substring(urlPath.lastIndexOf(File.separatorChar), urlPath.length());
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            URL url = new URL(urlPath);
            URLConnection conn = url.openConnection();
            conn.setConnectTimeout(1000 * 5);
            bis = new BufferedInputStream(conn.getInputStream());
            bos = new BufferedOutputStream(new FileOutputStream(path + name));
            byte[] bytes = new byte[512];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
            bos.flush();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    bis = null;
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    bos = null;
                    e.printStackTrace();
                }
            }
        }
        System.out.println("time: " + (System.currentTimeMillis() - now) / 1000 + "s");
    }

    public static void loadFile2(String urlPath) {
        long now = System.currentTimeMillis();
        final String path = "/Users/fumenyaolang/Desktop/gbj";
        final String name = urlPath.substring(urlPath.lastIndexOf(File.separatorChar), urlPath.length());
        InputStream is = null;
        OutputStream os = null;
        try {
            URL url = new URL(urlPath);
            URLConnection conn = url.openConnection();
            conn.setConnectTimeout(1000 * 5);
            is = new BufferedInputStream(conn.getInputStream());
            os = new BufferedOutputStream(new FileOutputStream(path + name));
            byte[] bytes = new byte[512];
            int len;
            while ((len = is.read(bytes)) != -1) {
                os.write(bytes, 0, len);
            }
            os.flush();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    is = null;
                    e.printStackTrace();
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    os = null;
                    e.printStackTrace();
                }
            }
        }
        System.out.println("time: " + (System.currentTimeMillis() - now) / 1000 + "s");
    }

    public static void main(String[] args) throws Exception {
//        final String filePath = "/Users/fumenyaolang/Downloads/personMemberExport_1562059657768.csv";
//        final String filePath = "/Users/fumenyaolang/Downloads/CentOS-7-x86_64-DVD-1804.iso";
//        FileUtil.rename(filePath, "CentOS-7-x86_64-DVD-1804(copy).iso");
//        FileUtil.showInfo(filePath);
//        FileUtil.copy(filePath, "CentOS-7-x86_64-DVD-1804(copy).iso");
//        FileUtil.loadFile("https://audio.kofuf.com/1578308757629.mp3");
//        FileUtil.loadFile2("https://pp.ting55.com/202001101558/bcdc414d3a75132106dcd4d041b20427/2015/01/36/1.mp3");
//        FileUtil.loadFile2("https://pp.ting55.com/202001101600/66f33ae1a9490b586eee1c2ffa86c0aa/2015/01/36/2.mp3");
//        for (int i = 31; i <= 36; i++) {
//            FileUtil.loadFileSync("http://180dx.181ps.com:8000/data1/x/小曾/和空姐同居的日子/和空姐同居的日子" + i + ".mp3");
//            Thread.sleep(500 );
//        }
        //FileUtil.loadFile("http://180dx.181ps.com:8000/data1/x/小曾/和空姐同居的日子/和空姐同居的日子24.mp3");
//        System.out.println(URLEncoder.encode("http://180dx.181ps.com:8000/data1/x/和空姐同居的日子/和空姐同居的日子","UTF-8"));
    }

}
