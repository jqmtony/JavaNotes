class Demo14{
	public static void main(String[] args){
		byte b = 1;
		//-- 多类型混合运算最终结果的类型以大的为准
		//-- 等号右边最终结果是int类型
		//-- byte short 和 char 在运算时会先转成int来运算
		//b = (byte)(b + 1);
		b++;
		b+=1;
		System.out.println(b);//2
	}
}