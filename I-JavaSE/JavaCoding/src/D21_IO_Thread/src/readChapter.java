

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Scanner;

public class readChapter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer, String> values = new HashMap<>();
		File file = new File(
				"C:\\Users\\Administrator\\Documents\\GitHub\\JavaNotes\\JavaSE\\JavaCoding\\src\\D21_IO_Thread\\src\\data\\�ҳ����׸�������.txt");
		// ����
		try {
			BufferedReader bReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "GBK"));
			// ���
			try {
				// һ���ж�ȡ����
				String line = "";
				String str = "";
				int count = 0;
				while (null != (line = bReader.readLine())) {
					// �߼�������2����λ�� - ����1����λ�ã�������Ҫ����ı���1������
					if (line.contains("��") && line.contains("��")) {
						values.put(count, str);
						str="";
						count++;
					} else {
						str = str + line;
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (UnsupportedEncodingException |

				FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ��ȡ
		System.out.println("������Ҫ��ȡ���½ڣ�");
		int i = scanner.nextInt();
		System.out.println(values.get(i));
	}
}
