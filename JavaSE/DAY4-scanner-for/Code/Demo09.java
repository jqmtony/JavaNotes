class Demo09{
	//-- ˮ�ɻ���
	public static void main(String[] args){
		//-- 1.�ṩѭ����ȡ���е���λ��
		int j = 0,k = 0,l = 0;
		for(int i = 100 ; i <= 999 ; i++){
			//-- 2.��ÿ��λ�ϵ���
			j = i % 10;
			k = i / 10 % 10;
			l = i / 100;
			/*
				double d = Math.pow(x,y) ��x��y�η�ֵ
			 */
			int result = (int)(Math.pow(j,3) + Math.pow(k,3) + Math.pow(l,3));
			if(result == i){
				System.out.println(i);
			}
			
		}
	}
}