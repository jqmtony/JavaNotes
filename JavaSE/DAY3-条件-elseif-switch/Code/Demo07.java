class Demo07 {
	public static void main(String[] args){
		int i = (int)(Math.random()*1000);
		System.out.println("i:\t" + i);
		if(i % 2 == 0){
			System.out.println("Å¼Êý");
		}else{
			System.out.println("ÆæÊý");
		}
	}
}