import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import org.xml.sax.InputSource;

public class chatServer {
	public static void main(String[] args) {

		try {
			/**
			 * ��һ�������ŷ����������ܿͻ��ˣ��õ���ַ��Ϣ
			 */
			// ����������˿�
			ServerSocket server = new ServerSocket(2048);
			// ��ʼ���ܿͻ��˵ķ���
			System.out.println("�������ѿ��ţ��ȴ��ͻ��˽��롭��");
			Socket soClient = server.accept();
			// ��ӭ�ͻ��˵�����
			System.out.println("�ͻ��ˣ�" + soClient.getInetAddress() + "�ѽ����������");
			/**
			 * �ڶ������ӷ������������Ϣ���ͻ���
			 */
			// �ṩ������������Ҫ���ͻ��˵�
			OutputStream os = soClient.getOutputStream();
			// �ṩһ�������������
			PrintWriter pWriter = new PrintWriter(os, true);
			// �������ˣ���ô�ͷ�һ�㶫�����и����˿�
			pWriter.println("���������Ƿ�������Ҫ������д��ʲô�Ļ����ͻ���������ж�����������~");
			/**
			 * ���������ӿͻ��˶�ȡ���ݵ������� ���� ����ͻ�����Ҫ���ҵ㶫�����أ��ͻ���Ҫ��д����������ҲҪ�ж�������ѽ��
			 */
			InputStream ipS = soClient.getInputStream();
			InputStreamReader ipsReader = new InputStreamReader(ipS);
			BufferedReader bReader = new BufferedReader(ipsReader);
			String getMsg = "";
			getMsg=bReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// TODO �ػ��ӿ�
		}

	}
}
