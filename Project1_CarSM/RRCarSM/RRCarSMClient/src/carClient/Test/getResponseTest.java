package carClient.Test;

import java.io.IOException;

import carClient.Utils.getServerResponse;

public class getResponseTest {

	/**
	 * 测试类
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		getServerResponse getResponse = new getServerResponse();
		String response = getResponse.getResponse("我是客户端");
		System.out.println("测试client是否收到server的response" + response);
	}

}
