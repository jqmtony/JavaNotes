package com.client.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSocket {
	/**
     * `获取服务端响应
     * @param request 客户端请求转化成的字符串
     * @return 服务端响应处理后返回的对象
     * @throws IOException
	 * @throws ClassNotFoundException 
     */
    public static String getResponse(String request) throws IOException {
        Socket socket = ClientSocketFactory.getSocket();

        //将传入的字符串输出流写入到socket输出流
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
        printWriter.println(request);
        
        //接收服务端返回的输出流,包装成对象输入流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "GBK"));
      //将返回的输入流转换成字符串并返回
        StringBuffer response = new StringBuffer();
        response.append(bufferedReader.readLine());

        printWriter.close();
        bufferedReader.close();
        socket.close();

        //将服务端返回的流转换成字符串返回
        return response.toString();
    }
}
