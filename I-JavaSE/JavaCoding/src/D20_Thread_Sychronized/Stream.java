package D20_Thread_Sychronized;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Stream {
	public static void main(String[] args) {
		// �����ļ���
		File f1 = new File("C:\\Users\\Administrator\\Desktop\\A");
		File f2 = new File("C:\\Users\\Administrator\\Desktop\\B");
		System.out.println("A�Ƿ񴴽��ɹ���" + f1.mkdirs());
		System.out.println("B�Ƿ񴴽��ɹ���" + f2.mkdirs());
		// �����ļ�
		File f3 = new File(f1, "A.txt");
		File f4 = new File(f2, "B.txt");
		OutputStream os1 = null;
		OutputStream os2 = null;
		InputStream is1 = null;
		StringBuilder sBuilder = new StringBuilder();
		try {
			System.out.println("A.txt������" + f3.createNewFile());
			System.out.println("B.txt������" + f4.createNewFile());
//			// д��
			os1 = new FileOutputStream(f3);
			os2 = new FileOutputStream(f4, true); // true��ʾ����д�룬�����Ǹ���
			os1.write("���".getBytes());
			os2.write("world".getBytes());
			os2.write("again".getBytes());

			// �õ��ļ�1�ĸ�2
			is1 = new FileInputStream(f3);
			byte[] buffer = new byte[1024];
			// ��ȡ
			System.out.println(is1.read(buffer));
			// ��ֵ
			String string = new String(buffer, 0, 10);
			os2.write((" " + string).getBytes());
			System.out.println("sb" + sBuilder.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
