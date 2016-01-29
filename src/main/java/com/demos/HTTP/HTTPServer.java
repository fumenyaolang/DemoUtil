package com.demos.HTTP;

import com.demos.util.ConfigParserUtil;
import com.demos.util.LogUtil;
import org.apache.commons.lang.StringUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by fumenyaolang on 2015-12-15.
 */
public class HTTPServer {

    //response to HTTP request
    public static void service(Socket socket) throws IOException, InterruptedException {
        /*读取http信息*/
        InputStream socketIn = socket.getInputStream();
        Thread.sleep(500);
        int size = socketIn.available();
        byte[] buffer = new byte[size];
        socketIn.read(buffer);
        String request = new String(buffer);
        LogUtil.out(request);

        /*解析http请求*/
        String firstLineOfRequest = request.substring(0, request.indexOf("\r\n"));
        String[] parts = firstLineOfRequest.split(" ");
        String uri = parts[1];
        if (StringUtils.isBlank(uri)) {
            LogUtil.out("error,uri is blank.");
        }
        //LogUtil.out("uri: " + uri + "," + (uri.split("i")).length);

        /*决定http相应正文的类型*/
        String contentType = ContentType.getTypeByValue(uri.split("\\.")[1]);
        //LogUtil.out(contentType);

        /*创建http相应结果*/
        String responseFirstLine = "HTTP/1.1 200 OK\r\n";//第一行
        String responseHeader = "Content-Type:" + contentType + "\r\n\r\n";//请求头
        uri = ConfigParserUtil.class.getResource("/" + uri).getPath();
        File file = new File(uri);
        InputStream in = new FileInputStream(file);

//     HTTPServer.class.getResourceAsStream(uri);//获得读取相应正文数据的输入流
        OutputStream socketOut = socket.getOutputStream();
        socketOut.write(responseFirstLine.getBytes());
        socketOut.write(responseHeader.getBytes());
        int len = 0;
        buffer = new byte[128];
        while ((len = in.read(buffer)) != -1)
            socketOut.write(buffer, 0, len);

        Thread.sleep(10000);
        socket.close();
    }

    public static void main(String[] args) throws IOException {
        //监听端口
        int port = 19090;
        ServerSocket serverSocket = new ServerSocket(port);
        LogUtil.out("服务器监听的端口：" + serverSocket.getLocalPort());
        //相应客户端
        while (true) {
            try {
                Socket socket = serverSocket.accept();
                LogUtil.out(socket.getInetAddress() + "建立连接,端口：" + socket.getPort());
                service(socket);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}