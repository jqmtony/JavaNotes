
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class server {
	public static void main(String[] args) {
		int count = 0;
		// -- 1-65535 ǰ1000��Ҫ��
		try {
			ServerSocket server = new ServerSocket(1024);
			while (true) {
				System.out.println("�����������ɹ�,�ȴ��ͻ��˰�...");
				// -- ���տͻ��˵�����.����ɹ��������Socket����
				Socket so = server.accept();
				// -- ����Socket������Դ�ӡ���ʵĿͻ��˵���Ϣ
				System.out.println("�������ѽ��ܿͻ��ˣ�" + so.getInetAddress());

				// -- ͨ��Socket��ȡ���������.û��ֱ�ӻ�ȡ�ַ�����APIֻ�ܻ�ȡֱ����
					OutputStream os = so.getOutputStream();
					System.out.println("�����");
					// -- ���ֽ�������װ�εõ�������.true�����Զ�ˢ��
					PrintWriter pw = new PrintWriter(os, true);
					// -- ������������ͻ��˷�������
					System.out.println("�����뷢�͸��ͻ��˵���Ϣ:");
					Scanner scan = new Scanner(System.in);
					String temp = "���";
					count = count +1;
					pw.println(temp+"��"+count);

					// -- ���տͻ��˷��ص���Ϣ
					BufferedReader br = new BufferedReader(new InputStreamReader(so.getInputStream(), "GBK"));
					String line = br.readLine();
					System.out.println("�յ��ͻ�����Ϣ:\t" + line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
