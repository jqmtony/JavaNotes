import java.util.Scanner;
// import java.util.Random;
/*
3.���������ε������߳����ж��Ƿ��ܹ���������Σ�
����ܹ���ɣ����������������Σ�
�������������������Ρ�

4.�ڿ���̨����һ����ݣ��ж��Ƿ������ꡣ
���ж�������������ܱ�400������
�����ܱ�4����ȴ���ܱ�100������

5.ĳ�û�������ݳ������ڷ��Ž���
���������һ����һ�ܣ���ÿ�ܵĽ�����500Ԫ��
����û�����һ�εĽ��������������ɼ������롣
*/
class Test{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// System.out.print("���������ε������߳�1��");
		// int a = scan.nextInt();
		// System.out.print("���������ε������߳�2��");
		// int b = scan.nextInt();
		// System.out.print("���������ε������߳�3��");
		// int c = scan.nextInt();
		
		// if((a^2+b^2)>(c^2)){
			// System.out.print("�����");
		// }else{
			// System.out.print("�������");
		// }
		// int i = scan.nextInt();
		// int i = (int)(Math.random()*100+1);
		// System.out.print("���֣�"+i);
		System.out.print("����һ����ݣ�");
		int i = scan.nextInt();
		if(i % 400 == 0 || (i/4==0 && i%100 != 0)){
		// 4-1.if��䣬���a����b�����ab
			System.out.println(i+"������");
		}else{
			// 4-2.else��䣬������ǣ����ba
			System.out.println(i+"��������");
		}
		
		// System.out.print("��������������");
		// int i = scan.nextInt(); //���������
		// // ��������/7=��������ڣ�����һ�ܵ����
		// // ÿ�ܵĽ���Ϊ500
		// // ����һ����һ�ܣ�Ҳ����˵ i % 7 ��= 0��week = i/7 +1
		// // ���� = week * 500
		// if( i % 7 != 0){
			// int sum = (i / 7 + 1) * 500;
			// System.out.println("����Ϊ���������ܣ���"+sum);
		// }else{
			// int sum = (i / 7) * 500;
			// System.out.println("����Ϊ�������ܣ���"+sum);
		// }
		
		
	}
}