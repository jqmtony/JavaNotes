class Demo10{
	public static void main(String[] args){
		/*
			比如说买车:假设有存款X
				X>100万  : 买卡宴
				X>80万   : 买Q7 实际条件:80<X<=100
				X>60万   : 买A6 实际条件:60<X<=80
				X>40万   : 买帕萨特
				X>20万   : 买蒙迪欧
				X>10万   : 买飞度
		 */
		int money = (int)(Math.random()*200);
		System.out.println("Money:\t" + money);
		if(money > 100){
			System.out.println("买卡宴");
		}else if(money > 80){
			System.out.println("买Q7");
		}else if(money > 60){
			System.out.println("买A6");
		}else if(money > 40){
			System.out.println("买帕萨特");
		}else if(money > 20){
			System.out.println("买蒙迪欧");
		}else if(money > 10){
			System.out.println("买飞度");
		}else{
			//-- 所有小于10万的请款
			System.out.println("你的法拉利在哪里!");
		}
	}
}