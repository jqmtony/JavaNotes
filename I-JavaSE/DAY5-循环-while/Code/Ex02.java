import java.util.Scanner;
class Ex02{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�������ع������ϵͳ > �������");
		for(int i = 0 ;i < 100 ;i ++){
			System.out.print("*");
			if(i == 49){
				System.out.println("\n");
				System.out.println("\t\t��ѡ�������Ʒ���:\t");
				System.out.println("\t1.T��\t2.����Ь\t3.������");
				System.out.println("");
			}
		}
		
		/*
			String ���ͱȽ����ʹ�õ���equalsIgnoreCase()����equals()
		 */
		String answer = "y";
		int goodsCount = 0;
		int goodsNum = 0;
		double totalGoods1 = 0;
		double totalGoods2 = 0;
		double totalGoods3 = 0;
		for(;"y".equalsIgnoreCase(answer);){
			System.out.print("\n��������Ʒ���:\t");
			goodsNum = scan.nextInt();
			System.out.print("�����빺������:\t");
			goodsCount = scan.nextInt();
			switch(goodsNum){
				case 1:
					totalGoods1 += 245.0*goodsCount;
					System.out.println("T��\t��245.0\t��" +(totalGoods1) );
					break;
				case 2:		
					totalGoods2 += 570.0*goodsCount;				
					System.out.println("����Ь\t��570.0\t��" +(totalGoods2) );
					break;
				case 3:
					totalGoods3 += 452.0*goodsCount;
					System.out.println("������\t��452.0\t��" +(totalGoods3) );
					break;				
				default:
					System.out.println("û�и���Ʒ");
					break;
			}
			System.out.print("�Ƿ����(y/n)");
			answer = scan.next();
		}
		System.out.println("�ۿ�:\t" + 0.8);
		double total  = totalGoods1 + totalGoods2 + totalGoods3;
		System.out.println("����ܼ�:��\t" + total);
		System.out.println("����ܼ�(�ۿۺ�):��\t" + (total*0.8));
		double realMoney = 0;
		for(;;){
			System.out.print("ʵ�ʽɷ�:��\t");
			realMoney = scan.nextDouble();
			//-- �жϸ���Ǯ������
			if(realMoney > total*0.8){
				break;
			}
			System.out.println("�͹�,Ǯ����Ŷ!");
		}
		System.out.println("��Ǯ:\t��" + (realMoney - total*0.8));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}