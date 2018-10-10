class Demo11{
	public static void main(String[] args){
		int i = 1;
		i = i++;
		System.out.println(i);
		i = ++ i;
		System.out.println(i);
		i = 1;
		i = i ++ + ++ i;
		//  1 + 3
		System.out.println(i);//4
		i = 1;
		i = ++i + i ++ + i;
		//  2 + 2 + 3
		System.out.println(i);//7
		i = 1;
		i = ++ i + ++ i;
		//  2 + 3
		System.out.println(i);//5
		i = 1;
		i = i ++ + i ++ + i;
		//  1 + 2 +3
		System.out.println(i);//6
	}
}