import java.util.Scanner;
class Ex04{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������һ���·�");
		int i = scan.nextInt();
		/*
			���¼����·��Ƿ���ȷ.������С��0,Ҳ�����Դ���12
		 */
		if(i <= 0 || i > 12){
			System.out.println("�·ݲ���");
			//-- ͨ��return������ں���
			return ;
		}
		
		String str = "";
		//-- �ж�����ʲô����
		if(i <= 3){
			str = "����";
		}else if(i <= 6){
			str = "�ļ�";
		}else if(i <= 9){
			str = "�＾";
		}else{
			str = "����";
		}
		System.out.println(str);
		
		
		/*
			Swtich�ó���ֵƥ��
			���������ƥ��if�Ƚ��ó�
		 */
		switch(i){
			case 1:
			case 2:
			case 3:
				str = "����"
				break;
			case 4:
			case 5:
			case 6:
				str = "�ļ�"
				break;
			case 7:
			case 8:
			case 9:
				str = "�＾"
				break;
			case 10:
			case 11:
			case 12:
				str = "����"
				break;
			default:
				break;
		}
		
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}