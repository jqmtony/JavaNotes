import java.util.Scanner;

/*
	2.	�ڿ���̨�Ӽ��������������������մӴ�С��˳�����
*/

class SequencePrint {
	public static void main(String[] args) {
		// 1.����
		// 2.����Scanner
		Scanner scan = new Scanner(System.in);
		// 3.��ʾ������������
		System.out.print("�������һ��������");
		int a = scan.nextInt();
		System.out.print("������ڶ���������");
		int b = scan.nextInt();
		System.out.print("�����������������");
		int c = scan.nextInt();
		// 4.�Ƚϴ�С
		int max = 0;
		int min = 0;
		int mid = 0;
		if(a>b){
			if(a>c){
				if(b>c){
					max = a;
					mid = b;
					min = c;
				}
			}
		}else{
			if(a>c){ //b,a,c
				max = b;
				mid = a;
				min = c;
			}else if(b>c){ 
				max = b;
				mid = c;
				min = a;
			}else{
				max = c;
				mid = b;
				min = a;
			}
		}
		// 5.�Ӵ�С˳�����
		System.out.println("��˳���С���������"+max+mid+min);
		System.out.println(toString(max));
		// 6.����ý���� a:1, b:2, c:3��������
		
	}
}








