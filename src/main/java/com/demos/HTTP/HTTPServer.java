package com.demos.HTTP;

import com.demos.util.LogUtil;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by fumenyaolang on 2015-12-15.
 */
public class HTTPServer {

    //response to HTTP request
    public static void service(Socket socket) throws IOException, InterruptedException {
        //read socket info
        InputStream socketIn = socket.getInputStream();
        Thread.sleep(500) ;
        int size = socketIn.available();
        byte[] buffer = new byte[size];
        socketIn.read(buffer);
        String request = new String(buffer);
        //LogUtil.out(request);

        //
        String firstLineOfRequest = request.substring(0, request.indexOf("\r\n"));
        String[] parts = firstLineOfRequest.split(" ");
        String uri = parts[1];

        String contentType;
        if (uri.indexOf("html") != -1 || uri.indexOf("htm") != -1)
            contentType = "text/html";
        else if (uri.indexOf("jpg") != -1 || uri.indexOf("jpeg") != -1)
            contentType = "image/jpeg";
        else if (uri.indexOf("gif") != -1)
            contentType = "image/gif";
        else
            contentType = "application/octet-stream";

        //response HTTP响应第一行
        String responseFirstLine = "HTTP/1.1 200 0K\r\n";
        //HTTP响应头
        String responseHeader = "Content-Type:" + contentType + "\r\n";
        InputStream in = HTTPServer.class.getResourceAsStream("root/" + uri);
        //LOG
        LogUtil.inputStreamLog(in);
        OutputStream socketOut = socket.getOutputStream();
        socketOut.write(responseFirstLine.getBytes());
        socketOut.write(responseHeader.getBytes());

        int len = 0;
        buffer = new byte[128];
        while ((len = in.read(buffer)) != -1)
            socketOut.write(buffer, 0, len);
        Thread.sleep(1000);
        socket.close();


    }

    public static void main(String[] args) {
        int port;
        ServerSocket serverSocket = null;
        //port
        try {
            port = Integer.parseInt(args[0]);
        } catch (Exception e) {
            LogUtil.out("port = 9090(default)");
            port = 9090;
        }
        try {
            serverSocket = new ServerSocket(port);
            LogUtil.out("server listen port:" + serverSocket.getLocalPort());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        while (true) {
            //
            try {
                //wait client TCP request
                final Socket socket = serverSocket.accept();
                LogUtil.out("client address is " + socket.getInetAddress() + ":" + socket.getPort());
                //response to request
                service(socket);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
