package D21_IO_Thread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.Content;

/**
 * 1.读取一本TxT小说.把小说的章节目录读取出来.保存到集合中.选择指定的章节直接显示对应章节的内容 2.提供上一章和下一章功能(选)
 * 3.提供百分比进度拖动功能(选)
 * 
 * @author Administrator
 *
 */
public class ReadChapters {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String chapter = null;
		String contents = null;

		HashMap<String, String> findC = new HashMap<>();

		File file = new File(
				"C:\\Users\\Administrator\\Documents\\GitHub\\JavaNotes\\JavaSE\\JavaCoding\\src\\D21_IO_Thread\\data\\我成了首富祖奶奶.txt");
		System.out.println(file.exists());
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "GBK"));

			String line = "";

			while (null != (line = br.readLine())) {
				if (line.contains("第") && line.contains("章")) {
					chapter = line;
					System.out.println(chapter);
				} else {
					System.out.println(line);
					contents = contents + line;
					findC.put(chapter,contents );
				}
			}
			/*String s1 = "1111";
			findC.put("1",s1);
			findC.put("1",s1+s1);*/
			// 输出hashMap
			for (Map.Entry<String, String> entry : findC.entrySet()) {
				System.out.println(entry.getKey() + " \n " + entry.getValue());
			}

		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
