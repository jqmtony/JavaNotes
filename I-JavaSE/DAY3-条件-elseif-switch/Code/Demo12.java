import java.util.Scanner;
/*
	���ÿ���ж�����
 */
class Demo12{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("��������:\t");
		int year = scan.nextInt();
		System.out.print("��������:\t");
		int month = scan.nextInt();
		//-- ���·ݽ���ƥ��
		/*
		if(month ==1){
			
		}else if(month == 2){
			
		}
		*/
		
		/*
			����month����Ҫ��ƥ��ı���
			������Ҫ�ڴ��������г����еĿ���ֵ
		 */
		switch(month){
			//-- ÿһ��ȡֵ�����ṩ��֮��Ӧ��һ��case
			case 1:
				System.out.println(month+"����31��");
				break;
			case 2:
				//-- .1�ж������껹��ƽ��
				if(year % 4==0 && year % 100 != 0 || year % 400 ==0){
					System.out.println(month+"����29��");
				}else{
					System.out.println(month+"����28��");
				}
				break;
			case 3:
				System.out.println(month+"����31��");
				break;
			case 4:
				System.out.println(month+"����30��");
				break;
			case 5:
				System.out.println(month+"����31��");
				break;
			case 6:
				System.out.println(month+"����30��");
				break;
			case 7:
				System.out.println(month+"����31��");
				break;
			case 8:
				System.out.println(month+"����31��");
				break;
			case 9:
				System.out.println(month+"����30��");
				break;
			case 10:
				System.out.println(month+"����31��");
				break;
			case 11:
				System.out.println(month+"����30��");
				break;
			case 12:
				System.out.println(month+"����31��");
				break;
			//-- �����������е�case��������
			default:
				System.out.println("������û�����!");
				break;
		}
	}
}