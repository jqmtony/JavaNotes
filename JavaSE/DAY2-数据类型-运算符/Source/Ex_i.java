class Ex_i {
	public static void main(String[] args) {
		//-- 用9个加号使i为9
		int i = 1;
		i = +i + +i + i++ + i++;
		// 1 + 1 + 1 + 2
		System.out.println(i);
	}
}