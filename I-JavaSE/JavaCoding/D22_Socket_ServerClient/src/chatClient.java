import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class chatClient {
	public static void main(String[] args) {
		try {
			/**
			 * ��һ�����ȷ��ʵ�������
			 */
			// ������ʷ��������ṩ�������ĵ�ַ�ͽӿ�
			Socket clientStocket = new Socket("127.0.0.1", 2048);
			/**
			 * �ڶ������ͻ���Ҫ�ж��������������������Ҳ���ǵ��ж�������
			 */
			// �ͻ����Լ������õ��������
			InputStream iStream = clientStocket.getInputStream();
			// �õ���֮��Ҫ��ȡ
			InputStreamReader isReader = new InputStreamReader(iStream);
			// ��ȡ֮��Ҫ����
			BufferedReader bfReader = new BufferedReader(isReader);
			// ��һ���ı����㻺��Ķ����Ķ���
			String getMsg = "";
			// �õ�����
			getMsg = bfReader.readLine();
			// ��ӡ����
			System.out.println(getMsg);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
