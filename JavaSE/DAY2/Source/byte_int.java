class byte_int {
	public static void main(String[] args) {
		/*
			这段讲的其实是是否需要强制转换的问题，
			小的到大的不用强转，大的转小的必须强转
		*/
		byte b = 1;
		//-- byte类型可以自动转换为int类型，完全不需要强转
		System.out.println(b);
		//-- 但是byte和int的1做简单算法的时候，必须强转
		b = (byte)(b+1);
		System.out.println("b+1="+b);
	}
}