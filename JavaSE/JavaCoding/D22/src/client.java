
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class client {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/**
		 * ��֮�������û�������ȷ���ټ���������ȷ�ͼ�������
		 */
		HashMap<Integer, String> user = new HashMap<>();
		user.put(1, "123");
		/*
		 * host: Ҫ������ʵ�������ַ:.���ڵ�ǰ��˵����˺Ϳͻ��˶��Ǳ���. 127.0.0.1 ��һ����·IP������. port: �˿ں�
		 * ÿһ�����Ӧ�ö���ռ��һ���˿ں� ��Socket�����ɹ��ʹ�������һ������˳ɹ�. 192.168.2.242
		 */
		try {
			while (true) {
				Socket so = new Socket("127.0.0.1", 1024);
				// -- 1.��ȡ������.���ڽ��շ���˷���������Ϣ
				InputStream is = so.getInputStream();
				// -- 2.���ֽ������а�װ�õ��ַ���.��װ�εõ�������
				InputStreamReader isr = new InputStreamReader(is, "GBK");
				BufferedReader br = new BufferedReader(isr);
				// -- 3.���û�����API�����ж�ȡ
				String line = br.readLine();
				System.out.println("�յ��������Ϣ:\t" + line);

				// -- 4.��ȡ�����.д��Ϣ�������
				OutputStream os = so.getOutputStream();
				// -- 5.װ�γɴ�ӡ��
				PrintWriter pw = new PrintWriter(os, true);
				// -- 6.���ռ���¼�������
				/**
				 * �û���¼ģ��
				 */
				while (true) {
					System.out.println("����������û����ƣ�" + user.get(1));
					if (user.get(1).equals(scan.next())) {
						System.out.println("��ӭ��½");
						break;
					}
				}
				System.out.println("�����뷢�͸�����˵���Ϣ:");
				String temp = scan.next();
				pw.println(temp);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}
