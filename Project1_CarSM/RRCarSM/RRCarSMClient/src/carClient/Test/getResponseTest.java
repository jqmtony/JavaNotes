package carClient.Test;

import java.io.IOException;

import carClient.Utils.getServerResponse;

public class getResponseTest {

	/**
	 * ������
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		getServerResponse getResponse = new getServerResponse();
		String response = getResponse.getResponse("���ǿͻ���");
		System.out.println("����client�Ƿ��յ�server��response" + response);
	}

}
