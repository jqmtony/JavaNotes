class Demo05{
	public static void main(String[] args){
		
		int i = (int)(Math.random()*10+1);
		System.out.println("随机数是:\t" + i);
		//-- 对i进行判断是大于等于5还是小于5
		if(i > 5){
			System.out.println("随机数大于5");
		}else{
			//-- else 代表if的所有不成立
			System.out.println("随机数小于或等于5");
		}
		System.out.println("结束");
	}
}