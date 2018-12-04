class Demo07{
	public static void main(String[] args){
		
		double sum = 0;
		int num = 1;
		for(int i = 1; i <= 7 ;i +=2){
			sum = sum + (double)1/i*num;
			num = num * -1;
		}
		System.out.println("sum:\t" + sum);
	}
}