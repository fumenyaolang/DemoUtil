package com.demos.util;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * 爬虫工具
 */
public class CrawlerUtil {

    /**
     * 广播剧《和空姐同居的日子》
     */
    public static void exec0(int page) throws IOException {
        URL url = new URL("https://ting55.com/glink");
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        conn.setConnectTimeout(1000 * 5);
        conn.setRequestMethod("POST");
        //head
        conn.setRequestProperty("Accept", "application/json, text/javascript, */*; q=0.01");
        conn.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
        conn.setRequestProperty("Accept-Language", "zh-CN,zh;q=0.9");
        conn.setRequestProperty("Cache-Control", "no-cache");
        conn.setRequestProperty("Connection", "keep-alive");
        conn.setRequestProperty("Content-Length", "24");
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        conn.setRequestProperty("Cookie", "Hm_lvt_ac3da4632dc24e9d361235e3b2d3a131=1578641176,1578641204; ting55_history=https%3A%2F%2Fting55.com%2Fbook%2F36-2%2560%25E5%2592%258C%25E7%25A9%25BA%25E5%25A7%2590%25E5%2590%258C%25E5%25B1%2585%25E7%259A%2584%25E6%2597%25A5%25E5%25AD%25901%25E6%259C%2589%25E5%25A3%25B0%25E5%25B0%258F%25E8%25AF%25B4%25E7%25AC%25AC2%25E7%25AB%25A0; JSESSIONID=846D86DAF6054DD45D32700BB58AA335; Hm_lpvt_ac3da4632dc24e9d361235e3b2d3a131=1578646274");
        conn.setRequestProperty("Host", "ting55.com");
        conn.setRequestProperty("Origin", "https://ting55.com");
        conn.setRequestProperty("Pragma", "no-cache");
        conn.setRequestProperty("Referer", "https://ting55.com/book/36-3");
        conn.setRequestProperty("Sec-Fetch-Mode", "cors");
        conn.setRequestProperty("Sec-Fetch-Site", "same-origin");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.117 Safari/537.36");
        conn.setRequestProperty("X-Requested-With", "XMLHttpRequest");
        conn.setRequestProperty("xt", "852c04686d0384d140b038459a3cc9a0");
        //param
        conn.setDoOutput(true);
        String param = "bookId=36&isPay=0&page=" + page;
        DataOutputStream dos = new DataOutputStream(conn.getOutputStream());
        dos.writeBytes(param);
        dos.flush();
        dos.close();
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuffer response = new StringBuffer();
        String lineContent = "";
        while ((lineContent = br.readLine()) != null) {
            response.append(lineContent);
        }
        br.close();
        //response --- {"ourl":"","plink":"","url":"https://pp.ting55.com/202001101744/b08ce406c06ac46988852fe3636f584a/2015/01/36/3.mp3","status":1}
        System.out.println(response);
        String mp3Url = response.substring(response.indexOf("https"), response.lastIndexOf("\",\""));
        System.out.println(mp3Url);
        //upload
//        FileUtil.loadFile2(mp3Url);
    }

    public static void main(String[] args) throws IOException {
        for (int i = 20; i <= 36; i++) {
            CrawlerUtil.exec0(i);
        }
    }
}
