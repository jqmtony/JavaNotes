package D21_IO_Thread;

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
				"/Users/ztnn/Documents/GitHub/JavaNotes/JavaSE/JavaCoding/src/D21_IO_Thread/data/�ҳ����׸�������.txt");
		// ����
		try {
			BufferedReader bReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "GBK"));
			// ���
			try {
				// һ���ж�ȡ����
				String line = "";
				String values1 = "";
				int count = 0;
				while (null != (line = bReader.readLine())) {
					// �߼�������2����λ�� - ����1����λ�ã�������Ҫ����ı���1������
					if (line.contains("��") && line.contains("��")) {
						System.out.println(line);
						count++;
					} else {
						values.put(count, line);
						// ͨ���ֶ�����count�������
						if (count == 14) {
							values1=line;
							System.out.println(values1);
						}
					}
				} 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
