import java.util.Arrays;

/*
 * 	6.	绘制一张地图,地图效果如右边.(最低要求用星号打印2.家庭作业)
 *  横的：横向30个符号，m=0，n=0~29
 *  竖的：第30个接竖的5个，m=1~5，n=30
 *  横的：竖的下面接横向30个，m=6，n=0~29
 *  竖的：再接竖的5个，m=7~12，n=30~35
 *  横的：再接横的30个，m=13，n=0~29
 */
public class D8_Ex7_drawMap {
	public static void main(String[] args) {
		// 创建数组，0~100
		String[] array = new String[100];
		
		for(int i=0;i<array.length;i++) {
			// 0~29正常输出符号
			if(i<30) {
				array[i]="*";
				System.out.print(array[i]);
			}else if(i<35){
				// 30~34回车输出，并填充29个空格
				if(i==30) {
					System.out.println();
				}
				// 在输出array[i]之前输出29个空格
				for(int j=0; j<29;j++) { 
					System.out.print(" "); // 换行，竖1
				}
				array[i]="*";
				System.out.println(array[i]); // 换行，竖1
			}else if(i<64) {
				// 35~64逆序横向输出，（）←（）
					array[array.length-1 - i]="*"; // 即100-1-i = 99-i
					array[63] = "/"; // 验证是否倒序输出
					System.out.print(array[array.length-1 - i]); // 换行，竖1					
			}else if(i<70) {
				//  65~69回车输出，竖2
				array[i]="*";
				System.out.println(array[i]); // 换行，竖2
			}else {
				// 70~99正常输出符号
				array[i]="*";
				System.out.print(array[i]);
			}
			
		}
		
		
	}
}
