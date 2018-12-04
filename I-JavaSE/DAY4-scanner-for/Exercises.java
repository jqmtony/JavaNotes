/* ������ϰ1����1+4+7+10...+100֮�� */

class test1 {
	public static void main(String[] args) {
		int sum = 0;
		// �����
		for(int i=1;i<=100;i+=3) {	
			sum += i;
		}
		// ����ͣ�����1717
		System.out.println(sum);
	}
}

/* ������ϰ2��ʹ��for��ӡ��10~100֮��������ͬʱ��5��9���������� */

class test2 {
	public static void main(String[] args) {
		for(int i=10; i<=100; i++) {
			// ���Ա�5��9���������ǿ��Ա�45������ֱ��дi%45=0����
			if(i%45==0) {
				System.out.println(i);
			}
		}
	}
}

/* 
	������ϰ3�������У�9,99,999��������̼���ǰ10���ֵ
	i = 9,9*10+9=99, 99*10+9=999,999*10+9=9999...
 */

class test3 {
	public static void main(String[] args) {
		long num = 9;
		for(int i=0; i<10; i++) {
			System.out.println(num);
			// ������㷨����10����1410065407
			// ˵�������洢��Χ��������Ҫ��long���ͣ�������int����
			// int������󱣴浽9��9
			num = num * 10 + 9;
		}
	
	}
}

/* 1-100֮�������֮�ͺ�ż��֮�� */

class test4 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		// ѭ��
		for(int i=1; i<100; i++) {
			if(i%2==0) {
				num1 += i;
			}else{
				num2 += i;
			}
			// ���
		}
		System.out.println("����֮�ͣ�"+num2);
		System.out.println("ż��֮�ͣ�"+num1);
	}
}

/* ��ѭ��������10�Ľ׳� */

class test5 {
	public static void main(String[] args) {
		int times = 1;
		for(int i=1; i<=10; i++) {
			// 10�Ľ׳ˣ�1*2*3����*10
			times *= i;
		}
		System.out.println("10�Ľ׳�Ϊ��"+times);
	}
}

/* 
	��1!+2!+...+7!�����
	���� 1 + 1*2 + 1*2*3 + 1*2*3*4 .... 1*....*7 
	��һ����ֵ��1
	�ڶ�����ֵ��1+1*2
	��������ֵ��1+1*2+1*2*3
	...
	���ߴ���ֵ��1+1*2+1*2*3....1*2*3~*7
 */

class test6 {
	public static void main(String[] args) {
		int times = 1;
		int sum = 0;
		for(int i=1; i<8; i++) {
			times = times * i; // ���һ�������
			sum = sum + times; 
			System.out.println("1!+2!+...+7!Ϊ��"+sum);
		}
		System.out.println("1~7�Ľ׳˺�Ϊ��"+sum);
	}
}

/* 
	��1*3*5*����*19��Ҳ�����������ĳ˻�
 */

class test7 {
	public static void main(String[] args) {
		int times = 1;
		for(int i=1; i<20; i+=2) {
			times *= i;
			System.out.println("1*3*5*����*19Ϊ��"+times);
		}
		// �������654729075
	}
}


/* ����һ��������n����1+2+3...+n֮�Ͳ���� */

class test8 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<10; i++) {
			sum += i;
			System.out.println("i��"+i);
			System.out.println("�ͣ�"+sum);
		}
		System.out.println("����nΪ10��1+2+3...+n֮��Ϊ��"+sum);
	}
}

/* 
	�� 1-1/3+1/5-1/7.....-1/99+1/101
	����Ҫ������������n*i-3
	-3,5,-7,9,-11....-99,101
	��ʽ�ǣ�1/(2i-1) * (-1)��i-1�η�
	�з���������һ������double����Ȼȡֵ����0
 */

class test9 {
	public static void main(String[] args) {
		double sum = 0.0d;
		double base1 = 0.0d;
		double base2 = -1.0d;
		for(double i=1; i<102; i+=2) {
			base1 = 1/i;
			base2 = base2 * -1;
			sum = sum + base1 * base2;
			System.out.println(sum); // �����0.7902
		}
	}
}

/* �Ż��� */

class test9_2 {
	public static void main(String[] args) {
		double sum = 0;
		int num = 1;
		for(double i=1; i<102; i+=2) {
			sum = sum + (double)1/i*num;
			num = num * -1;
		}
		System.out.println(sum);
	}
}

/* 
	10.	���쳲���������ǰ20���ֵ������� 
	�ӵ�3�ʼ,ÿһ�����ǰ����֮��
	n1,n2,n3��n1+n2��,n4(n2+n3),n5(n3+n4).....n20(n18+n19)
*/

class test10 {
	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 1;
		int n3 = 0;
		System.out.println("n1:"+n1);
		System.out.println("n2:"+n2);
		for(int i=0; i<20; i++) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			// ���1711
			System.out.println("n3:"+n3);
		}
	}
}

/* 
	11.	������е�ˮ�ɻ���
	����λ��������֮�͵������������λ�������������
	x*x*x+y*y*y+z*z*z=xyz
*/
class test11 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int sum = 0;
		for(int i=99; i<190; i++) {
			a = i/100;
			b = i/10%10;
			c = i%10;
			sum = a*a*a+b*b*b+c*c*c;
			if(sum==i) {
				// ���153��ˮ�ɻ���
				System.out.println(i+"��ˮ�ɻ�����");
			}else{
				System.out.println(i+"����");
			}
			// System.out.println(i);
			// System.out.println(a);
			// System.out.println(b);
			// System.out.println(c);
			// System.out.println(sum);
			System.out.println("----------------");
		}
	}
}































