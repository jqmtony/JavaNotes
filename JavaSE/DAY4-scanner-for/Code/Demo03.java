class Demo03{
	
	public static void main(String[] args){
		//1.	��1+4+7+10����+100֮�͡�
		int sum = 0;
		for(int i = 1 ; i <= 100 ; i += 3){
			sum = sum + i;
		}
		System.out.println("Sum:\t" + sum);
		
		System.out.println("---------------");
		
		//2.	��ӡ���10~100֮��������ͬʱ��5��9����������
		for(int i = 10 ;i <= 100 ; i ++){
			//-- ���if����
			if(i % 5 == 0 && i % 9 == 0){
				System.out.println(i);
			}
		}
		
		System.out.println("---------------");

		//3.	�����У�9��99��999��9999...����̼���ǰ10���ֵ��
		long temp = 9;
		for(int i = 1; i <= 10 ; i++){
			/*
				���ʹ��int����������.��󱣴浽9��9.
			 */
			System.out.println(temp);
			temp = temp * 10 + 9;
		}

		System.out.println("---------------");

		//4.	��1��100֮�������֮����ż��֮�͡�
		int sum1 = 0 , sum2 = 0;
		//-- sum1  ���� sum2 ����ż��
		for(int i = 1 ; i <= 100 ; i++){
			if(i % 2 == 0){
				sum2 += i;
			}else{
				sum1 += i;
			}
		}
		System.out.println("������:\t" + sum1);
		System.out.println("ż����:\t" + sum2);
		
		//5.	��ѭ��������10�Ľ׳� (���Ǵ�1�˵�10)
		//-- �׳��Ǵ�1�˵����������.ʹ��!����ʾ 1!����1�Ľ׳�
		System.out.println("---------------");
		int product = 1 ;
		for(int i = 1 ; i <= 10 ; i++){
			product *= i;
		}
		System.out.println("10!:\t" + product);
		
		System.out.println("---------------");
		
		//6.	ѭ����1��+2��+3��+...+6!+7!
		//-- ���¶������������г�ʼ��
		sum = 0;
		product = 1;
		for(int i = 1 ; i <= 7 ;i ++){
			//-- ��׳�
			product*=i;
			//-- ���
			sum += product;
		}
		
		System.out.println("sum:\t" + sum);
		
		//7. 	��1*3*5*...*19֮��
		product = 1;
		for(int i = 1 ; i <= 19 ; i += 2){
			product *= i;
		}
		System.out.println("product:\t" + product);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}