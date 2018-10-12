class Demo03{
	public static void main(String[] args){
		
		int i = 0;
		do{
			//-- do是先执行的.执行完成后才会执行while的条件判断
			System.out.println(i);
			//-- 注意细节这里的末尾一定要有分号.
		}while(i > 0);
	}
}