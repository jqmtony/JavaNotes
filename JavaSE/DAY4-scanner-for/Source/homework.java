/* 
	1.	����һ��������Ʒ���»
	������������һ�����ӵļ۸�2000-10000֮�䣩��
	�û�ȥ���¼۸������5���ڲ¶Լ۸񣬱�ɻ�ô���Ʒ��
	������5�Σ���ʾ���ܿ�ϧ����û�л�ý�Ʒ�����½���������
	��5���ڲ¶ԵĻ�����ʾ����ϲ�㣬����˴˽�Ʒ��������
	��ʾ��
	����2000-10000���������
	1��	�����ڿ�ͷ����Math ��
	Import java.util.Random;
	2��	���������
	Random random=new Random();
	Int price= random.nextInt(8000)+2000;
 */
 
 import java.util.Scanner;
 import java.util.Random;
 
 class Guess {
	 public static void main(String[] args) {
		 // 1.��������۸�
		 Random random = new Random();
		 int price = random.nextInt(8000)+2000;
		 System.out.println("������Ʒ���¼۸�Ϊ��\t"+price);
		 // 2.����Scanner���������־���
		 Scanner scan = new Scanner(System.in);
		 
		 // 3.5�ξ��»���
		 for(int i=1;i<6;i++) {
			System.out.print("�����뾺�¼۸� \t");
			int guess = scan.nextInt();
			// 3-1. �¶�
			if(guess==price) {
				System.out.println("��ϲ�㣬����˴˽�Ʒ��");
				break;
			}else{ // 3-2. �´�
				System.out.println("����Ŷ����ʣ�ྺ�»��᣺"+(5-i));
			}
		 } 
		 System.out.println("���½�����");
	 }
 }
 
 /* 
	2.	��ɹ�����Ʒ���㹦�ܣ�
    1��ѭ��������Ʒ��ź͹����������������ѽ��ۼӵ��ܽ��
    2�����롰n����ʼ���ˣ�������8�ۣ�
	3������ʵ������������
 */
 
 class shopping {
	 public static void main(String[] args) {
	 // 0. ����Scanner
	 Scanner scan = new Scanner(System.in);
	 // 1. ������Ʒ���
	 System.out.println("");
	 System.out.println("�������ع������ϵͳ > �������");
	 System.out.println("");
	 System.out.println("");
	 System.out.println("*************************");
	 System.out.println("��ѡ�������Ʒ��ţ�");
	 System.out.println("");
	 System.out.println("");
	 System.out.println("1.T�� \t 2.����Ь \t 3.������");
	 System.out.println("*************************");
	 System.out.println("");
	 // 2. ������Ʒ��š���������
	 int price1 = 0;
	 int price2 = 0;
	 int price3 = 0;
	 for(int i=0;i<3;i++) {
		System.out.print("��������Ʒ��ţ�");
		int clothe = scan.nextInt();
		System.out.print("�����빺��������");
		int number = scan.nextInt();
		switch(clothe) {
			case 1:
				int product1 = 245;
				price1 = number * product1;
				System.out.println("T�� \t"+product1+"\t"+price1);
				break;
			case 2:
				int product2 = 570;
				price2 = number * product2;
				System.out.println("����Ь \t"+product2+"\t"+price2);
				break;
			case 3: 
				int product3 = 100;
				price3 = number * product3;
				System.out.println("������ \t"+product3+"\t"+price3);
				break;
		}
		// ѯ���Ƿ����
		System.out.println("");
		System.out.print("�Ƿ����(y/n)��");
		String str = scan.next();
		switch(str){
			 case "n":
				System.out.println("����һ��n");
				break;
			default:
				System.out.println("�ⲻ��һ��n");
				break;
		 }
	 }
	 // 3. �������ѽ���Ʒ*���� = ���
		System.out.println("");
		System.out.println("");
		System.out.println("�ۿۣ�0.8");
		int total = price1 + price2 + price3;
		System.out.println("����ܼƣ�\t"+total);
		int amount = 900;
		System.out.println("ʵ�ʽ��ѣ�\t"+amount);
		System.out.println("��Ǯ��\t"+(amount-total*0.8));
	 // 4. �����������ˣ���� = ��� * 0.8
		 
	 }
 }
	
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 