class Demo02{
	public static void main(String[] args){
		//--While
		
		//-- Ŀ��:��ӡ1-10.
		int i = 1;
		//-- ����.��һ������ֵ�����������ܹ���������ֵ�ı��ʽ.
		while(i <= 10){
			//-- Ҫ�ظ�ִ�е�����
			System.out.println(i);
			i ++;
		}
		
		System.out.println("******************");
		
		//-- Ŀ��: ��ӡ10-1
		i = 10;
		while(i>0){
			System.out.println(i);
			i -- ;
		}
		
		System.out.println("******************");
		System.out.println("i:\t" + i);
		//-- Ŀ��: ���Ǵ�ӡ1-10
		i = 1;
		while(true){
			System.out.println(i);
			i ++ ;
			if(i == 11){
				break;
			}
		}		
	}
}