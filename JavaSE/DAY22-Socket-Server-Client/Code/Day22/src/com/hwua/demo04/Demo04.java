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
		//-- 创建HttpClient对象
		CloseableHttpClient client = HttpClients.createDefault();
		//-- 创建请求方法.按照HTTP协议.请求方法有很多.我们常用的有GET和POST
		//-- 参数是请求的资源地址
		HttpGet get = new HttpGet("https://www.baidu.com/img/bd_logo1.png");
		//-- 执行请求 得到响应对象
		try {
			CloseableHttpResponse execute = client.execute(get);
			//-- 通过响应对象获取响应实体
			HttpEntity entity = execute.getEntity();
			int code = execute.getStatusLine().getStatusCode();
			//-- 200 代表请求 响应OK
			System.out.println("code:\t" + code);
			//-- 判断实体是否为null 
			if (entity != null) {
				//-- 获取请求的流资源
				InputStream is = entity.getContent();
				//-- 读取流
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
