package D20_Thread_Sychronized;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Stream {
	public static void main(String[] args) {
		// 创建文件夹
		File f1 = new File("C:\\Users\\Administrator\\Desktop\\A");
		File f2 = new File("C:\\Users\\Administrator\\Desktop\\B");
		System.out.println("A是否创建成功：" + f1.mkdirs());
		System.out.println("B是否创建成功：" + f2.mkdirs());
		// 创建文件
		File f3 = new File(f1, "A.txt");
		File f4 = new File(f2, "B.txt");
		OutputStream os1 = null;
		OutputStream os2 = null;
		InputStream is1 = null;
		StringBuilder sBuilder = new StringBuilder();
		try {
			System.out.println("A.txt创建：" + f3.createNewFile());
			System.out.println("B.txt创建：" + f4.createNewFile());
//			// 写入
			os1 = new FileOutputStream(f3);
			os2 = new FileOutputStream(f4, true); // true表示继续写入，而不是覆盖
			os1.write("你好".getBytes());
			os2.write("world".getBytes());
			os2.write("again".getBytes());

			// 拿到文件1的给2
			is1 = new FileInputStream(f3);
			byte[] buffer = new byte[1024];
			// 读取
			System.out.println(is1.read(buffer));
			// 赋值
			String string = new String(buffer, 0, 10);
			os2.write((" " + string).getBytes());
			System.out.println("sb" + sBuilder.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
