class Demo03{
	public static void main(String[] args){
		int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		//-- �������������б���.ѭ��ȡ���е�Ԫ�ص���˼
		//-- ֱ��д9����Hard Coding Ӳ����.д����
		for(int i = 0 ; i < 9 ; i ++){
			System.out.println(array[i]);
		}
		
		//-- Ӳ�����ǲ��Ƽ�ʹ�õ�.
		//-- ��������,����չ��,��ά���Բ���.
		//-- Java�ṩ��API length ������������ĳ���
		for(int i = 0 ; i < array.length ; i ++){
			System.out.println(array[i]);
		}		
	}
}