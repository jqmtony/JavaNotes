
public class Demo01 {
	
	public static void main(String[] args) {
	
		//-- ͨ����������()  ���÷���
		printOneToTen();
		//The method printOneToX(int) in the type 
		//Demo01 is not applicable for the arguments ()
		printOneToX(7);

	}

	//-- [] �����ѡ 
	//[�������η�] [��̬���η�] [�������η�] ����ֵ ��������(�����б�) {������}
	
	//-- ����һ������.
	public static void printOneToTen() {
		for(int i = 1 ; i <= 10 ;i ++) {
			System.out.println(i);
		}
	}
	
	public static void printOneToX(int x) {
		for (int i = 1; i <= x; i++) {
			System.out.println(i);
		}
	}
	
	
	
	
	
}
