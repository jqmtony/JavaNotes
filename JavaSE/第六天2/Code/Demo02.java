class Demo02{
	public static void main(String[] args){
		int[] array = {1,2,3,4,5,6,7,8,9};
		/*
			[]  ��ʲô���� ����(array)
			[i] ��ʲô���� ���ڵ�ǰ��˵��int����.	
					�����������±�Ϊi��Ԫ��.
		 */
		System.out.println(array[5]);
		
		/*
			���������±�Ϊ5�Ŀռ���и�ֵ.
		 */
		array[5] = 10;
		
		System.out.println(array[5]);
		
	}
}