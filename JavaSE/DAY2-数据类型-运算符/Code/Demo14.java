class Demo14{
	public static void main(String[] args){
		byte b = 1;
		//-- �����ͻ���������ս���������Դ��Ϊ׼
		//-- �Ⱥ��ұ����ս����int����
		//-- byte short �� char ������ʱ����ת��int������
		//b = (byte)(b + 1);
		b++;
		b+=1;
		System.out.println(b);//2
	}
}