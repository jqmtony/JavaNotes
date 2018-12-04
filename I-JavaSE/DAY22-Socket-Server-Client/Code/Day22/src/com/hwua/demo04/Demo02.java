/**
 * 
 */
package com.hwua.demo04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Administrator
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		try {
			//-- 参数就是要请求的资源地址
			URL url = new URL("http://27.221.100.83/6572CB38A8F3482D68347F2CE5/03001201005B645780ECE4A06B457194FC551D-C094-4E3F-A9EB-FDE639EDB6CA.mp4?ccode=050F&duration=1605&expire=18000&psid=d3041f371f63d22a03ff86693fecdf81&ups_client_netip=3af752be&ups_ts=1541492813&ups_userid=&utid=SD5oFLJwsFECAdz4GKYIhwiT&vid=XMzc2MTkwNDU2OA%3D%3D&vkey=A973174539720d909cd80007e7b96107f&sp=");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			int size = conn.getContentLength();
			is = conn.getInputStream();
			os = new FileOutputStream("e:\\TC35\\习大大.mp4");
			byte[] buffer = new byte[1024];
			int length = 0;
			double length2 = 0;
			while (-1 != (length = is.read(buffer))) {
				length2 += length;
				System.out.println("已经加载:\t" + (length2/size * 100) + "%");
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
