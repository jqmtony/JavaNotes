
public class Demo06 {
	public static void main(String[] args) {
		System.out.println(getRabbit(24));
	}
	
	//-- �ݹ�
	public static int getRabbit(int month) {
		if (month == 1 || month == 2) {
			return 1;
		}else {
			return getRabbit(month - 1) + getRabbit(month - 2);
		}
	}

	/*
	 * �ݹ��Ƿǳ�������Դ��.���Ƽ�ʹ��.
	 * month = 3
	 * getRabbit(2) + getRabbit(1);
	 * 
	 * month = 4;
	 * getRabbit(3) + getRabbit(2);
	 * getRabbit(2) + getRabbit(1); + getRabbit(2);
	 * 
	 * month = 5
	 * getRabbit(4) + getRabbit(3);
	 * getRabbit(3) + getRabbit(2) + getRabbit(2) + getRabbit(1);
	 * getRabbit(2) + getRabbit(1) + getRabbit(2) + getRabbit(2) + getRabbit(1);
	 * 
	 * 
	 */
}
