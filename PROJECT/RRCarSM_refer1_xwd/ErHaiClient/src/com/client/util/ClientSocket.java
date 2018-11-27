package com.client.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSocket {
	/**
     * `��ȡ�������Ӧ
     * @param request �ͻ�������ת���ɵ��ַ���
     * @return �������Ӧ����󷵻صĶ���
     * @throws IOException
	 * @throws ClassNotFoundException 
     */
    public static String getResponse(String request) throws IOException {
        Socket socket = ClientSocketFactory.getSocket();

        //��������ַ��������д�뵽socket�����
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
        printWriter.println(request);
        
        //���շ���˷��ص������,��װ�ɶ���������
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "GBK"));
      //�����ص�������ת�����ַ���������
        StringBuffer response = new StringBuffer();
        response.append(bufferedReader.readLine());

        printWriter.close();
        bufferedReader.close();
        socket.close();

        //������˷��ص���ת�����ַ�������
        return response.toString();
    }
}
