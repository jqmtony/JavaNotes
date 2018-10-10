class Demo12 {

	public static void main(String[] args) {
		int i = 0;
		System.out.println(i++);//0
		System.out.println(++i);//2
		
		i = 0;
		System.out.println(i = i++);//0
		System.out.println(i = ++i);//1
		
		i = 0;
		System.out.println(i++);//0
		System.out.println(i = ++i);//2
		
		i = 1;
		i = i + +1;
		System.out.println(i);
	}
}