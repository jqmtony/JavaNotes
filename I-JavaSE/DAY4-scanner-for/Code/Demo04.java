class Demo04{
	public static void main(String[] args){
		//-- 1��+2��+3��+...+6!+7! ��׳˺�
		//-- ���һ:��1-7�ĺ�
		int sum = 0;
		for(int i = 1 ; i <= 7 ; i ++){
			sum = sum + i;
		}
		
		//-- ��ֶ�:��1-7ÿ�����Ľ׳�
		//-- �׳�: ��1��ʼ�˵���������.
		/*
			1! = 1*1
			2! = 1*2 = 2*1!
			3! = 1*2*3 = 3*2!
			7! = 1*2*3*4*5*6*7
			n! = N*(n-1)!
		 */
		int product = 1;
		for(int i = 1;i <= 7 ;i ++){
			//-- ��õľ���1!
			product = product * i;
		}
		
		//-- ����
		//-- ��Ϊ������ѭ���Ѿ�ʹ�ù�����������.
		//-- ����������Ҫ���¸�ֵ.
		sum = 0;
		product = 1;
		for(int i = 1 ;i <= 7 ;i ++){
			product = product * i;
			sum = sum + product;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}