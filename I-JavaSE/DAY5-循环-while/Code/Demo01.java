import java.util.Scanner;
class Demo01{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		/*
			1 2 4 3 
			  2 4 3
		 */
		int count = 0;
		String answer = "";
		for(int i = 1 ; i <= 5 ; i ++){
			System.out.println("��ӭ���ٵ�" + i + "�ҵ�");
			answer = "n";
			for(int j = 1 ; j <= 3 && "n".equalsIgnoreCase(answer); j++){
				System.out.println("�Ƿ�Ҫ�뿪?(y/n)");
				answer = scan.next();
				if(answer.equalsIgnoreCase("n")){
					System.out.println("��" + i + "�ҵ�,�����˵�" + j + "���·�");
					count ++;
				}				
			}
			
			System.out.println("������!");
		}
		System.out.println("һ������:\t" +count +"���·�");
	}
}