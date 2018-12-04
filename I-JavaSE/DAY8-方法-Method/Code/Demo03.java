import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
 * 数组的增删改查.
 */
public class Demo03 {
	//-- 被final修饰的变量就是常量.fianl代表最终不可以被修改的意思.
	private static final int MENU_ITEM_EXIT = 7;
	private static final int MENU_ITEM_SORT_DESC = 6;
	private static final int MENU_ITEM_SORT_ASC = 5;
	private static final int MENU_ITEM_FIND = 4;
	private static final int MENU_ITEM_DELETE = 3;
	private static final int MENU_ITEM_ADD_ONE = 1;
	private static final int MENU_ITEM_ADD_TWO = 2;
	//-- 目的:让Scanner的作用域由main方法变成整个类
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Random random = new Random();
		

		int[] array = new int[10];

		//-- 初始化数组.
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100) + 1;
			// array[i] array中下标为i的元素
			// array才有长度.代表数组.
			// 分清:到底谁是元素,谁是数组.
		}

		//-- 控制整个代码是否重复执行.
		boolean isContinue = true;
		
		while (isContinue) {

			System.out.println("原数组:\t" + Arrays.toString(array));

			System.out.println("1.顺序增加元素");
			// Ctrl + Alt + Down Copy Line
			System.out.println("2.指定位置增加元素");
			System.out.println("3.删除指定元素");
			System.out.println("4.判断元素是否存在");
			System.out.println("5.从小到大打印元素");
			System.out.println("6.从大到小打印元素");
			System.out.println("7.退出");
			
			System.out.println("-------------------------------\n请输入选择:\n\t");

			int choose = 0;
			//-- 对输入的数字进行验证不可以是特殊字符.也不可以超出范围.
			while (true) {
				try {
					choose = scan.nextInt();
					if (choose < 1 || choose > 7) {
						System.out.println("没有该选项");
						continue;
					}
					break;
				} catch (InputMismatchException e) {
					System.out.println("输入类型不匹配,只能是数字");
					scan.next();
				}
			}

			//-- 对选择进行匹配
			switch (choose) {
			//-- 像这里的1 2 3 4 5 6 7 直接已数值常量形式存在的 一般都叫做魔法值
			//-- 在项目.按照代码规范.魔法值是不推荐使用的
			case MENU_ITEM_ADD_ONE:
				array = addElement(array);
				break;
			case MENU_ITEM_ADD_TWO:
				System.out.println("增加2");
				break;
			case MENU_ITEM_DELETE:
				System.out.println("删除");
				break;
			case MENU_ITEM_FIND:
				System.out.println("判断元素是否存在!");
				break;
			case MENU_ITEM_SORT_ASC:
				listAllElement(array);
				break;
			case MENU_ITEM_SORT_DESC:
				System.out.println("排序2");
				break;
			case MENU_ITEM_EXIT:
				// -- 退出整个应用.
				isContinue = false;
				break;
			default:
				break;
			}
		}
	}
	
	/**
	 * 
	 * @param array 要添加元素的数组
	 * @return 添加好元素后的新数组
	 */
	public static int[] addElement(int[] array) {
		//-- 1.引用数据类型作为参数是需要判断参数是否真实存在的.
		//-- 目的:为了避免空指针
		if (array == null) {
			System.out.println("传入的数组为空!");
			return null;
		}
		
		//-- 2.当参数没有问题.开始添加元素
		System.out.println("请输入要加入的元素:\t");
		int target = scan.nextInt();
		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = target;
		
		//-- 3.返回添加好元素后的数组.
		return array;
	}
	
	
	
	/**
	 * 把数组中的元素进行排序,并打印
	 * @param array 要排序的数组
	 */
	public static void listAllElement(int[] array) {
		Arrays.sort(array);
	}
	
	
	
	
	
	
	
	
	
	
	

}
