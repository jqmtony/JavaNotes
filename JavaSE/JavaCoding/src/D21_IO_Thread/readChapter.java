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
				"/Users/ztnn/Documents/GitHub/JavaNotes/JavaSE/JavaCoding/src/D21_IO_Thread/data/我成了首富祖奶奶.txt");
		// 主体
		try {
			BufferedReader bReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "GBK"));
			// 输出
			try {
				// 一行行读取文字
				String line = "";
				String values1 = "";
				int count = 0;
				while (null != (line = bReader.readLine())) {
					// 逻辑：标题2的行位置 - 标题1的行位置，就是需要输出的标题1的内容
					if (line.contains("第") && line.contains("章")) {
						System.out.println(line);
						count++;
					} else {
						values.put(count, line);
						// 通过手动输入count进行输出
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
