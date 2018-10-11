class Demo08{
	public static void main(String[] args){
		// 1 1 2 3 5		
		int num = 0;
		int num1 = 1;
		int num2 = 1;
		for(int i = 1 ;i <= 20 ; i ++){
			if(i == 1 || i == 2){
				num = 1;
			}else{
				num = num1 + num2;
				num1 = num2;
				num2 = num;
			}
			
			System.out.println("第" + i +"项:\t" + num);
		}
	}
	/*
		递归:自己调用自己
	 */
	public int method(int n){
		if(n == 1 || n == 2){
			return 1;
		}else{
			return method(n-1) + method(n-2);
		}		
	}
}













