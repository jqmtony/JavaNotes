class Demo09{
	//-- 水仙花数
	public static void main(String[] args){
		//-- 1.提供循环获取所有的三位数
		int j = 0,k = 0,l = 0;
		for(int i = 100 ; i <= 999 ; i++){
			//-- 2.求每个位上的数
			j = i % 10;
			k = i / 10 % 10;
			l = i / 100;
			/*
				double d = Math.pow(x,y) 求x的y次方值
			 */
			int result = (int)(Math.pow(j,3) + Math.pow(k,3) + Math.pow(l,3));
			if(result == i){
				System.out.println(i);
			}
			
		}
	}
}