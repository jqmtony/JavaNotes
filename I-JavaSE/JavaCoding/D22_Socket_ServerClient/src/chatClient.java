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
			 * 第一步：先访问到服务器
			 */
			// 请求访问服务器，提供服务器的地址和接口
			Socket clientStocket = new Socket("127.0.0.1", 2048);
			/**
			 * 第二步：客户端要有读服务器输出流的能力，也就是得有读的能力
			 */
			// 客户端自己得先拿到输出入流
			InputStream iStream = clientStocket.getInputStream();
			// 拿到了之后要读取
			InputStreamReader isReader = new InputStreamReader(iStream);
			// 读取之后要缓存
			BufferedReader bfReader = new BufferedReader(isReader);
			// 给一个文本放你缓存的读到的东西
			String getMsg = "";
			// 拿到内容
			getMsg = bfReader.readLine();
			// 打印内容
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
