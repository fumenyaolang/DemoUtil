package com.demos.HTTP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * http client
 * Created by fumenyaolang on 2015-12-15.
 */
public class HTTPClinet {

    public static void doGet(String host, int port, String uri) {
        Socket socket = null;
        try {
            socket = new Socket(host, port);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        StringBuffer sb = new StringBuffer("GET " + uri + " HTTP/1.1\r\n");

        try {
            sb.append("Accept:*/*\r\n");
            sb.append("Accept-Language:zh-cn\r\n");
            sb.append("Accept-Encoding:gzib,deflate\r\n");
            sb.append("User-Agent: HTTPClient\r\n");
            sb.append("Host:localhost:9090\r\n");
            sb.append("Connection:Keep-Alive\r\n\r\n");

            OutputStream socketOut = socket.getOutputStream();
            socketOut.write(sb.toString().getBytes());
            Thread.sleep(2000);
            InputStream socketIn = socket.getInputStream();
            int size = socketIn.available();
            byte[] buffer = new byte[size];
            socketIn.read(buffer);
            System.out.println(new String(buffer));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String uri = "index.html";
        if (args.length != 0)
            uri = args[0];
        doGet("localhost", 9090, uri);
    }

}
