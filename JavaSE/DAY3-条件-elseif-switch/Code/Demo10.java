class Demo10{
	public static void main(String[] args){
		/*
			����˵��:�����д��X
				X>100��  : ����
				X>80��   : ��Q7 ʵ������:80<X<=100
				X>60��   : ��A6 ʵ������:60<X<=80
				X>40��   : ��������
				X>20��   : ���ɵ�ŷ
				X>10��   : ��ɶ�
		 */
		int money = (int)(Math.random()*200);
		System.out.println("Money:\t" + money);
		if(money > 100){
			System.out.println("����");
		}else if(money > 80){
			System.out.println("��Q7");
		}else if(money > 60){
			System.out.println("��A6");
		}else if(money > 40){
			System.out.println("��������");
		}else if(money > 20){
			System.out.println("���ɵ�ŷ");
		}else if(money > 10){
			System.out.println("��ɶ�");
		}else{
			//-- ����С��10������
			System.out.println("��ķ�����������!");
		}
	}
}