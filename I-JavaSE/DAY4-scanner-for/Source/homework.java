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
		 int price = random.nextInt(8001)+2000;
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
				if(i==5) {
					System.out.println("5���㶼�´� o(�i�n�i)o");
				}else {
					System.out.println("����Ŷ����ʣ�ྺ�»��᣺"+(5-i));
					// 5-i����ͨ����for(����)����Ϊ��int-5;i<=1;i--��
					// ������ʣ�ྺ�»����ֱ����i���������ʹ���
				}
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
	 // 1. ������Ʒ��� -> ʹ��forѭ��iȡ1~100��print"*"��i==49
	 // -> for���ѡ�������Ʒ���123,51~100�����Լ��������print"*"
	 System.out.println("\n\n�������ع������ϵͳ > �������\n\n\n\n");
	 System.out.println("*************************");
	 System.out.println("��ѡ�������Ʒ��ţ�\n");
	 System.out.println("1.T�� \t\t 2.����Ь\t\t 3.������");
	 System.out.println("*************************\n\n");
	 // 2. ������Ʒ��š���������
	 int price1, price2, price3 = 0;
	 int temp = 0;
	 int total = 0;
	 // ����������y�����������ƣ�for(;"y".equalsIgnoreCase(guess);)
	 String answer = "y";
	 for(;"y".equalsIgnoreCase(answer);) {
		System.out.print("��������Ʒ��ţ�");
		int clothe = scan.nextInt();
		System.out.print("�����빺��������");
		int number = scan.nextInt();
		switch(clothe) {
			case 1:
				int product1 = 245;
				price1 = number * product1;
				temp = price1;
				System.out.println("T�� \t\t"+product1+"\t\t"+price1);
				break;
			case 2:
				int product2 = 570;
				price2 = number * product2;
				temp = price2;
				System.out.println("����Ь \t\t"+product2+"\t\t"+price2);
				break;
			case 3: 
				int product3 = 100;
				price3 = number * product3;
				temp = price3;
				System.out.println("������ \t\t"+product3+"\t\t"+price3);
				break;
		}
		/* 
			�ۼ��ܽ���Ϊ����ÿ��ֻ��ѡ��һ����Ʒ��
			���Բ��ܵ�������ÿ����Ʒ������ķ�ʽ����ÿ��ͳ���ۼ� 
		*/
		total += temp;
		// ѯ���Ƿ����
		System.out.print("\n�Ƿ����(y/n)��");
		answer = scan.next(); 
		/* 
		�·������ǹ涨����n���ܽ�����
		��for�ĺ����Ѿ�������y�ż���������û��Ҫ 
		*/
		// ����string�Ƚϴ�С�������ú�����a.equalsIgnoreCase(���Դ�СдA)��a.equals(b)
		// boolean bl = str.equals("n");
		// if(bl){ break;}
	 }
	 // 3. �������ѽ���Ʒ*���� = �����ˣ���� = ��� * 0.8
		System.out.println("\n\n�ۿۣ�0.8");
		System.out.println("����ܼƣ�\t"+total*0.8);
		// �ɷѽ����߼����Ը�Ϊ����
		int amount = 900;
		System.out.println("ʵ�ʽ��ѣ�\t"+amount);
		System.out.println("��Ǯ��\t\t"+(amount-total)+"\n");
	 }
 }
 
 /* 
		3.	��5���·�ר���꣬ÿ����๺��3����
		�û�����ѡ���뿪���������·���
		����ӡ�ܹ����˼����·���
 */
 
 class StoreShop {
	 public static void main(String[] args) {
		 // ����Scanner
		 Scanner scan = new Scanner(System.in);
		 int count = 0;
		 String answer = "";
		 // ���5�ҵ�
		 for(int i=1;i<=5;i++) {
			 System.out.println("��ӭ�����"+i+"�ҵ�\n");
			 // �ս����ʱ����ǽ��꣬�Ƚ������·�j��ѭ����
			 answer = "n";
			 // ÿ�ҵ꣬�����3���·�
			 for(int j=1;j<=3 && "n".equalsIgnoreCase(answer);j++) {
				 // ���Բ������Կ������·���ʱ��Ϳ���ѡ����
				 System.out.print("�Ƿ�Ҫ�뿪��ҵꣿ(y/n)");
				 answer = scan.next();
				 // ���뿪���Զ���һ���·�
				 if("n".equalsIgnoreCase(answer)) {
					 System.out.println("��ӭ���ڵ�"+i+"�ҵ����"+j+"һ���·�\n");
					 count++;
				 }
			 }
		 }
		 System.out.println("\n--------------------------------------");
		 System.out.println("��һ������ "+count+" ���·� (*^��^*)��");
	 }
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 