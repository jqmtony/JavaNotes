
public class DataType{
	public static void main(String[] args){
		/*
			-- 声明8个变量对应原生数据类型的8小种
		*/
		
		byte b = 1;
		short s = 1;
		int i = 1;
		//-- 后缀L是用于强调该类型是long类型，L大小写均可
		long L1 = 1L;
		long l1 = 1l;
		//-- 同理float和double强调的f和d大小写均可
		float f = 0.5f;
		double d = 0.6d;
		
		char ch = 'a';
		boolean blnT = true;
		boolean blnF = false;
		
		//-- 输出8个变量
		System.out.println("b");
		System.out.println("s");
		System.out.println("i");
		System.out.println("L1");
		System.out.println("l1");
		System.out.println("f");
		System.out.println("d");
		System.out.println("ch");
		System.out.println("blnT");
		System.out.println("blnF");
		
		/*
			字符类型的两种赋值方式
		*/
		
		//-- '单引号内容'只能是一个字符，不能是一串字符，否则返回错误：未结束的字符文字，char是2个字节表1个字符
		char chNormal = 'a';
		//-- ASCii编码不需要单引号，数字对应编码表的字符
		char chASCii = 97; 
		char chA = 40;
		char chB = 57;
		
		//-- 输出两个字符
		System.out.println("chNormal");
		System.out.println("chASCii");		
		//-- 两个char如果是数字，可以相加，得到int类型
		System.out.println("char 40 + char 57 ="+(chA+chB));	
		
		/*
			布尔数据类型的赋值是否可以用其它来代替
			如果bool = 1（int类型）或 'a'（字符类型），
			会提示错误：不兼容的类型：int无法转换为boolean
		*/
		boolean bool = true;
		System.out.println("bool");
		
	}
}