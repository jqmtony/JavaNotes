class Demo02{
	public static void main(String[] args){
		int num = 1;
		/*
			Ŀ��:��ӡ1-10
			i �������Ǽ�¼��ѭ���˶��ٴ�
		 */
		for(int i = 1;i <= 10;i++){
			System.out.println(num);
			num = num + 1;
		}
		//-- ������������޸�
		//-- ����ȫ��:i��num��ȡֵһ��.�Ƿ������i
		//-- �����ְ:����¼ѭ���˶��ٴ�.Ҳ�䵱����ӡ������
		for(int i = 1;i <= 100;i+=2){
			System.out.println(i);
			
		}
	}
}