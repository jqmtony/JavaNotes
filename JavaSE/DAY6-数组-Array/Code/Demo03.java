class Demo03{
	public static void main(String[] args){
		int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		//-- 对上面的数组进行遍历.循环取其中的元素的意思
		//-- 直接写9叫做Hard Coding 硬编码.写死了
		for(int i = 0 ; i < 9 ; i ++){
			System.out.println(array[i]);
		}
		
		//-- 硬编码是不推荐使用的.
		//-- 可重用性,可扩展性,可维护性不高.
		//-- Java提供了API length 用来代表数组的长度
		for(int i = 0 ; i < array.length ; i ++){
			System.out.println(array[i]);
		}		
	}
}