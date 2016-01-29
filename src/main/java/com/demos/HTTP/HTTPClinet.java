package com.demos.HTTP;

import com.demos.util.LogUtil;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * http client
 * Created by fumenyaolang on 2015-12-15.
 */
public class HTTPClinet {

    public static void doGet(String host, int port, String uri) throws IOException, InterruptedException {
        LogUtil.out("host : " + host + " |  port : " + port + " | uri : " + uri);
        /*创建HTTP请求*/
        StringBuffer sb = new StringBuffer();
        sb.append("GET " + uri + " HTTP/1.1\r\n");
        sb.append("Accept: */*\r\n");
        sb.append("Accept-Language: zh-cn\r\n");
        sb.append("Accept-Encoding: gzip,deflate\r\n");
        sb.append("User-Agent: HTTPClient\r\n");
        sb.append("Host: localhost:19090\r\n");
        sb.append("Connection: Keep-Alive\r\n\r\n");

        /*发送HTTP请求*/
        Socket socket = new Socket(host, port);
        OutputStream socketOut = socket.getOutputStream();
        socketOut.write(sb.toString().getBytes());
        Thread.sleep(2000);

        /*接受响应结果*/
        InputStream socketIn = socket.getInputStream();
        int size = socketIn.available();
        byte[] buffer = new byte[size];
        socketIn.read(buffer);
        LogUtil.out(new String(buffer));

        socket.close();
    }

    public static void main(String[] args) throws IOException {
        String host = "localhost";
        int port = 19090;
        String uri = "index.html";
        try {
            doGet(host, port, uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
