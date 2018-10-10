
import java.util.Scanner;

public class ex1_grade {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//-- 输入成绩
		System.out.println("请输入数学成绩：");
		int math = scan.nextInt();
		System.out.println("请输入语文成绩：");
		int chinese = scan.nextInt();
		System.out.println("请输入英语成绩：");
		int english = scan.nextInt();
		//-- 总分和平均分
		int sum = math + chinese + english;
		int ave = sum / 3;
		System.out.println("总分："+sum+"\t平均分："+ave);
	}
}
