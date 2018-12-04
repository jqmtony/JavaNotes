/**
 * 
 */
package com.hwua.demo04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

/**
 * @author Administrator
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		//-- ����HttpClient����
		CloseableHttpClient client = HttpClients.createDefault();
		//-- �������󷽷�.����HTTPЭ��.���󷽷��кܶ�.���ǳ��õ���GET��POST
		//-- �������������Դ��ַ
		HttpGet get = new HttpGet("https://www.baidu.com/img/bd_logo1.png");
		//-- ִ������ �õ���Ӧ����
		try {
			CloseableHttpResponse execute = client.execute(get);
			//-- ͨ����Ӧ�����ȡ��Ӧʵ��
			HttpEntity entity = execute.getEntity();
			int code = execute.getStatusLine().getStatusCode();
			//-- 200 �������� ��ӦOK
			System.out.println("code:\t" + code);
			//-- �ж�ʵ���Ƿ�Ϊnull 
			if (entity != null) {
				//-- ��ȡ���������Դ
				InputStream is = entity.getContent();
				//-- ��ȡ��
				byte[] buffer = new byte[1024];
				int length = 0;
				OutputStream os = new FileOutputStream("e:\\TC35\\bd_logo2.png");
				while (-1 != (length = is.read(buffer))) {
					os.write(buffer, 0, length);
				}				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
