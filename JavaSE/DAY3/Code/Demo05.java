class Demo05{
	public static void main(String[] args){
		
		int i = (int)(Math.random()*10+1);
		System.out.println("�������:\t" + i);
		//-- ��i�����ж��Ǵ��ڵ���5����С��5
		if(i > 5){
			System.out.println("���������5");
		}else{
			//-- else ����if�����в�����
			System.out.println("�����С�ڻ����5");
		}
		System.out.println("����");
	}
}