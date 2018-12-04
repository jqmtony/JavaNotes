

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
				"C:\\Users\\Administrator\\Documents\\GitHub\\JavaNotes\\JavaSE\\JavaCoding\\src\\D21_IO_Thread\\src\\data\\我成了首富祖奶奶.txt");
		// 主体
		try {
			BufferedReader bReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "GBK"));
			// 输出
			try {
				// 一行行读取文字
				String line = "";
				String str = "";
				int count = 0;
				while (null != (line = bReader.readLine())) {
					// 逻辑：标题2的行位置 - 标题1的行位置，就是需要输出的标题1的内容
					if (line.contains("第") && line.contains("章")) {
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
		// 读取
		System.out.println("请输入要读取的章节：");
		int i = scanner.nextInt();
		System.out.println(values.get(i));
	}
}
