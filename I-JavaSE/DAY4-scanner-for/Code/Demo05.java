class Demo05{
	//Ŀ��:��10��������ż���Ľ׳˺�
	
	public static void main(String[] args){
		//-- 1.���ṩһ������:�ṩ1-10���ڵ���
		//-- �ṩ1.�ṩ2.�ṩ3 һֱ�� �ṩ10
		//-- һֱ�����ظ�������.��Ҫ����ʹ��ѭ�������ٹ�����
		int i = 1;
		int producet = 1;
		int sum = 0;
		for(; i <= 10 ; i++){
			//-- ��׳�
			producet *= i;
			System.out.println(i+"!:\t" + producet);
			//-- ����ж�����:�ܹ���2������ż��
			if(i % 2 == 0){

				//-- ���
				sum += producet;
			}
		}
		System.out.println("1-10����ż���Ľ׳˺�:\t" + sum);
		
	}
}