class Demo10 {
	public static void main(String[] args){
		/*
		�߼������ʾ��
		 */
		boolean b1 = true;
		boolean b2 = false;
		
		boolean result = true;
		//-- ͬΪ��ʱΪ��,��һ���Ǽپ��Ǽ� 
		result = b1 &&  b2;
		System.out.println("result:" + result);//false
		//-- ͬΪ��ʱΪ��,��һ��λ�������
		result = b1 ||  b2;
		System.out.println("result:" + result);//true
		//-- ���ȡ�����Ǽ�
		result = !b1;
		System.out.println("result:" + result);//false
		//-- �ٵ�ȡ��������
		result = !b2;
		System.out.println("result:" + result);//true
		
		//-- һ�����������ͬ���͵ı���
		int i = 3,j = 4;
		//-- i>jʹ�ù�ϵ���������һ�����ʽ.
		//-- �ñ��ʽ���������ǲ�������
		//-- �漰��ϵ���߼���������.
		//-- ��ִ�й�ϵ�õ�����ֵ.��ִ���߼�
		//--     false && true
		result = i>j && i<j ;
		System.out.println("result:" + result);//false
		result = i>j || i<j ;
		System.out.println("result:" + result);//true
		result = !(i>j);
		System.out.println("result:" + result);//true
		
		
		
		
		
		
		
		
		
	}
}