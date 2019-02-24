class Ex02{
	public static void main(String[] args){
		String str = "中";
		switch(str){
			case "中":
				System.out.println(1);
				break;
			case "西":
				System.out.println(2);
				break;
			case "东":
				System.out.println(3);
				break;
			case "南":
				System.out.println(4);
				break;
			case "北":
				System.out.println(5);
				break;	
			case "发财":
				System.out.println(6);
				break;	
			default:
				/*
					规范上要求default是一定不可以省略的.
				 */
				break;
		}
	}
}