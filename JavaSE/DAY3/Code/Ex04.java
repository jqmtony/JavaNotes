class Ex04{
	public static  void main(String[] args){
		//-- 1.ʹ�������
		/*
			Math.random()�����һ��0��1�������.
			�ܹ�ȡ��0,ȡ����1
			[0,1)
			һ����λ��
			Ŀ��:[100,999]
			*1000 [0,1000)->[0,999]+100->[100,1099]
			1099->999 -100
			*(1000-100)
			
		 */
		int num = (int)(Math.random()*900+100);
		System.out.println("num:" + num);
		//-- ��λ
		int i = num /100;
		//-- ʮλ
		int j = num % 100 / 10;
		//-- ��λ
		int k = num % 10;
		
		System.out.println("��λ:\t"+ k);
		System.out.println("ʮλ:\t"+ j);
		System.out.println("��λ:\t"+ i);
		
	}
}