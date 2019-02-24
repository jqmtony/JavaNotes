class Demo06{
		//-- continue;
	public static void main(String[] args){
		for(int i = 0 ; i < 10 ; i ++){
			if(i == 5){
				//-- 不会执行下面的代码
				continue;
				System.out.println(1111);
			}
			System.out.println(i);
			
		}
	}
}