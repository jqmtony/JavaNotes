/* ����һ��x��ֵ����y��ֵ�����,������� */
import java.util.Random;

class VariableF {
	public static void main(String[] args){
		// �������һ��x��ֵ
		double x = Math.random()*10 - 5;
		System.out.println("������x��ֵΪ��"+x);
		// ����y
		int y = 0;
		if(x>0) {
			y = 1;
		}else if(x==0) {
			y = 0;
		}else {
			y = -1;
		}
		// ���
		System.out.println("y��ֵΪ��"+y);
		}
}