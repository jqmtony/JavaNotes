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
	 *  获取客户端返回的字符串
	 * @param socket 该客户端的io流
	 * @return 客户端返回的字符串
	 * @throws IOException
	 */
    public static String getResponse(Socket socket) throws IOException {

        //接收客户端返回的字符串
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //将返回的字符串包装传递给服务工厂,调用业务dao包,然后返回生成的字符串结果
        StringBuffer response = new StringBuffer();
        response.append(bufferedReader.readLine());
        bufferedReader.close();
        
        return response.toString();
        
    }
    /**
     * 处理客户端返回的字符串,然后返回结果
     * @param serviceFactory 调用服务的工厂
     * @param socket socket 该客户端的io流
     * @throws Exception 
     * @throws SQLException 
     */
    public static void getResponse(ServiceManager serviceFactory , Socket socket) throws SQLException, Exception {
    	
        String result = serviceFactory.getService(getResponse(socket));
        
        // 将返回的字符串传回客户端
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
        printWriter.println(result);
        
        printWriter.close();
    }
}
