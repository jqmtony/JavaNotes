class Demo06 {
	public static void main(String[] args) {
		float f = (float)0.0;
		// F的作用就是表明该数值是float类型.
		float f1 = 0.0F;
		
		//-- 这里下划线起到的作用是分隔.让二进制数
		//-- 好读一些
		int i = 0b10_0010_1000_1000;
		System.out.println(i);
		10 + -10
	  直接用10和-10的原码相加得到的不是0.
	  +10的原码 01010 
	  -10的原码 11010 对应整数的原码.把符号位改成1	
	  -10的反码 10101 原码的符号位不变其它位取反
	  -10的补码 10110 反码的符号位不变最低位+1
	    符号位  数值位 
		1  		0110	
		0 		1010
	   10 		0000 
	
	}
}








