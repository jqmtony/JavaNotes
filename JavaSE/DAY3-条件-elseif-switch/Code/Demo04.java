class Demo04{
	public static void main(String[] args){
		
		System.out.println(1);
		/*
			���Գ䵱����������:
			1.��ϵ�����. ��ϵ���������Ľ����һ������ֵ������Ϊ����
			2.����ֵ����.
			3.�߼������.
			4.��ֵ���.���޲������͵ĸ�ֵ���.
		 */
		int i = 10; 
		 
		 
		if(i >= 10){
			System.out.println("����Ϊ��1");
		}
		
		if(true){
			System.out.println("����Ϊ��2");
		}
		//-- �߼�������Ĳ�����������ǲ���ֵ.���Ҳ�ǲ���ֵ.
		if(1!=1 || 1==1){
			System.out.println("����Ϊ��3");			
		}
		
		boolean b = false;
		if(b = true){
			System.out.println("����Ϊ��4");			
		}
		//-- ifС�����ڱ�����һ������ֵ�������ܹ���������ֵ�ı��ʽ.
		/*
		if(i = 11){
			System.out.println("����Ϊ��5");
		}
		*/
		
		System.out.println(2);
	}
}





