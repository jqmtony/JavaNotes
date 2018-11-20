package carServer.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.SQLException;

import carServer.Manager.ServiceManager;

public class ServiceSocket {
	/**
	 *  ��ȡ�ͻ��˷��ص��ַ���
	 * @param socket �ÿͻ��˵�io��
	 * @return �ͻ��˷��ص��ַ���
	 * @throws IOException
	 */
    public static String getResponse(Socket socket) throws IOException {

        //���տͻ��˷��ص��ַ���
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //�����ص��ַ�����װ���ݸ����񹤳�,����ҵ��dao��,Ȼ�󷵻����ɵ��ַ������
        StringBuffer response = new StringBuffer();
        response.append(bufferedReader.readLine());
        bufferedReader.close();
        
        return response.toString();
        
    }
    /**
     * ����ͻ��˷��ص��ַ���,Ȼ�󷵻ؽ��
     * @param serviceFactory ���÷���Ĺ���
     * @param socket socket �ÿͻ��˵�io��
     * @throws Exception 
     * @throws SQLException 
     */
    public static void getResponse(ServiceManager serviceFactory , Socket socket) throws SQLException, Exception {
    	
        String result = serviceFactory.getService(getResponse(socket));
        
        // �����ص��ַ������ؿͻ���
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
        printWriter.println(result);
        
        printWriter.close();
    }
}
