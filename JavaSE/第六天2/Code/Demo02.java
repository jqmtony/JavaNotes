class Demo02{
	public static void main(String[] args){
		int[] array = {1,2,3,4,5,6,7,8,9};
		/*
			[]  是什么类型 数组(array)
			[i] 是什么类型 对于当前来说是int类型.	
					代表数组中下标为i的元素.
		 */
		System.out.println(array[5]);
		
		/*
			给数组中下标为5的空间进行赋值.
		 */
		array[5] = 10;
		
		System.out.println(array[5]);
		
	}
}