import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
 * �������ɾ�Ĳ�.
 */
public class Demo03 {
	//-- ��final���εı������ǳ���.fianl�������ղ����Ա��޸ĵ���˼.
	private static final int MENU_ITEM_EXIT = 7;
	private static final int MENU_ITEM_SORT_DESC = 6;
	private static final int MENU_ITEM_SORT_ASC = 5;
	private static final int MENU_ITEM_FIND = 4;
	private static final int MENU_ITEM_DELETE = 3;
	private static final int MENU_ITEM_ADD_ONE = 1;
	private static final int MENU_ITEM_ADD_TWO = 2;
	//-- Ŀ��:��Scanner����������main�������������
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Random random = new Random();
		

		int[] array = new int[10];

		//-- ��ʼ������.
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100) + 1;
			// array[i] array���±�Ϊi��Ԫ��
			// array���г���.��������.
			// ����:����˭��Ԫ��,˭������.
		}

		//-- �������������Ƿ��ظ�ִ��.
		boolean isContinue = true;
		
		while (isContinue) {

			System.out.println("ԭ����:\t" + Arrays.toString(array));

			System.out.println("1.˳������Ԫ��");
			// Ctrl + Alt + Down Copy Line
			System.out.println("2.ָ��λ������Ԫ��");
			System.out.println("3.ɾ��ָ��Ԫ��");
			System.out.println("4.�ж�Ԫ���Ƿ����");
			System.out.println("5.��С�����ӡԪ��");
			System.out.println("6.�Ӵ�С��ӡԪ��");
			System.out.println("7.�˳�");
			
			System.out.println("-------------------------------\n������ѡ��:\n\t");

			int choose = 0;
			//-- ����������ֽ�����֤�������������ַ�.Ҳ�����Գ�����Χ.
			while (true) {
				try {
					choose = scan.nextInt();
					if (choose < 1 || choose > 7) {
						System.out.println("û�и�ѡ��");
						continue;
					}
					break;
				} catch (InputMismatchException e) {
					System.out.println("�������Ͳ�ƥ��,ֻ��������");
					scan.next();
				}
			}

			//-- ��ѡ�����ƥ��
			switch (choose) {
			//-- �������1 2 3 4 5 6 7 ֱ������ֵ������ʽ���ڵ� һ�㶼����ħ��ֵ
			//-- ����Ŀ.���մ���淶.ħ��ֵ�ǲ��Ƽ�ʹ�õ�
			case MENU_ITEM_ADD_ONE:
				array = addElement(array);
				break;
			case MENU_ITEM_ADD_TWO:
				System.out.println("����2");
				break;
			case MENU_ITEM_DELETE:
				System.out.println("ɾ��");
				break;
			case MENU_ITEM_FIND:
				System.out.println("�ж�Ԫ���Ƿ����!");
				break;
			case MENU_ITEM_SORT_ASC:
				listAllElement(array);
				break;
			case MENU_ITEM_SORT_DESC:
				System.out.println("����2");
				break;
			case MENU_ITEM_EXIT:
				// -- �˳�����Ӧ��.
				isContinue = false;
				break;
			default:
				break;
			}
		}
	}
	
	/**
	 * 
	 * @param array Ҫ���Ԫ�ص�����
	 * @return ��Ӻ�Ԫ�غ��������
	 */
	public static int[] addElement(int[] array) {
		//-- 1.��������������Ϊ��������Ҫ�жϲ����Ƿ���ʵ���ڵ�.
		//-- Ŀ��:Ϊ�˱����ָ��
		if (array == null) {
			System.out.println("���������Ϊ��!");
			return null;
		}
		
		//-- 2.������û������.��ʼ���Ԫ��
		System.out.println("������Ҫ�����Ԫ��:\t");
		int target = scan.nextInt();
		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = target;
		
		//-- 3.������Ӻ�Ԫ�غ������.
		return array;
	}
	
	
	
	/**
	 * �������е�Ԫ�ؽ�������,����ӡ
	 * @param array Ҫ���������
	 */
	public static void listAllElement(int[] array) {
		Arrays.sort(array);
	}
	
	
	
	
	
	
	
	
	
	
	

}
