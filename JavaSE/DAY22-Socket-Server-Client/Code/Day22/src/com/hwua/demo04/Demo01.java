/**
 * 
 */
package com.hwua.demo04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		try {
			//-- 参数就是要请求的资源地址
			URL url = new URL("https://www.baidu.com/img/bd_logo1.png");
			//-- 打开流
			 is = url.openStream();
			 os = new FileOutputStream("e:\\TC35\\bd_logo1.png");
			byte[] buffer = new byte[1024];
			int length = 0;
			while (-1 != (length = is.read(buffer))) {
				os.write(buffer, 0, length);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
