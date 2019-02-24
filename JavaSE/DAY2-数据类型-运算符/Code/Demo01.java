/**
	这里是JavaDoc注释.一般写在类的上面和
	函数(方法)的上面对类和方法进行解释说
	明.
	
	这个东西的写法进公司后会有模板的.
	@date   日期/时间
	@copyright 版权所属
	@author 作者
 */

class Demo01{
	
	/**
	 *  这是写在方法上面的注释.
	 *  对方法的功能进行解释说明
	 *  一样有模板的.
     *  @param 参数
     *  @return 返回值
     *  @exception 异常处理	 
	 */
	public static void main(String[] args){
		/*
			这是
			多行
			注释
		 */
		System.out.println("多行注释"); 
		 
		//-- 这是单行注释.不可以加行末注释
		System.out.println("单行注释"); //-- 这叫行末注释属于单行注释.这么写语法不报错.但是编码规范不建议这么写
		
	}
}












