import java.util.Random;
class Demo02{
	public static void main(String[] args){
		//-- ��ȡ������ĵ�һ�ַ�ʽMath.random() ȡֵ[0,1)
		double num1 = Math.random();
		System.out.println("num1:\t" + num1);
		
		//-- ��ȡ������ĵڶ��ַ�ʽRandom
		//-- 1������.���������Ĭ���ǵ�ǰϵͳʱ��
		//-- �����ӺͲ������ӵ���������ÿ��ִ�в����������һ���Ͳ�һ��.
		//-- ���ӵ�Ŀ����Ϊ�˲���ʹ��.��֤�����������ͬ�������²���N��
		//-- 1ֻ��һ������.��Ϊ����������㷨������Դ�����ṩ��������.
		Random random = new Random(1);
		
		//-- 1000 �Ƿ�Χ��ȡֵ��[0,1000);
		int num2 = random.nextInt(1000);
		System.out.println("num2:\t" + num2);	
	}
}