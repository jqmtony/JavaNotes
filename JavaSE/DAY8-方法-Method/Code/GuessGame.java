import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args){
		//-- 0.Scanner��Random�ṩ
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int npcNameChoose = 0;
		String npcName = "";
		
		int playScore = 0;
		int npcScore = 0;
		int gameCount = 0;
		
		//-- 1.��Ϸ����
		System.out.println("*******************************");
		System.out.println("************��ȭ,��ʼ**********");
		System.out.println("*******************************");
		
		System.out.println("��ȭ����:1.����\t2.ʯͷ\t3.��");
		System.out.print("��ѡ��Է���ɫ(1.���� 2.��˹ 3.̩��):\t");
		
		while(true){
			try{
				npcNameChoose = scan.nextInt();
				//-- ��ֹ����Ĳ�������
				if(npcNameChoose < 1 || npcNameChoose > 3){
					System.out.println("������Χֻ��ѡ��1-3");
					continue;
				}
				//-- ����while��ѭ��.
				break;
			}catch(InputMismatchException e){
				System.out.println("�������Ͳ�ƥ��ֻ��������.");
				//-- �����¼�벻ƥ�䱣����Scanner��Ҫȡ����.
				scan.next();
			}
		}		
		
		//-- 2.���������ʼ��
		System.out.println("�������������:\t");
		String playName = scan.next();
		
		switch(npcNameChoose){
			case 1:
				npcName = "����";
				break;
			case 2:
				npcName = "��˹";
				break;
			case 3:
				npcName = "����";
				break;
			default:
				//-- ��ֺ� ��������һ�������.
				;
				break;
		}
		System.out.print(playName + "VS" + npcName);
		
		//-- 3.�ظ�����		
		
		//-- дѭ��������ѭ����һ��˼·:�Ȱ��ظ�ִ�е�д����.�������ѭ����.
		//-- ����ʱע��ѭ������.
		
		System.out.println("Ҫ��ʼ��?(y/n)");
		String answer = scan.next();
		for(;"y".equalsIgnoreCase(answer);){
			System.out.println("*******************************");
			//-- 3.1.��ҳ�ȭ��NPC�������ȭ
			System.out.print("���ȭ:1.����\t2.ʯͷ\t3.��(������Ӧ����)");
			int playChoose = scan.nextInt();		
			
			showPlayerChoose(playName, playChoose);	
			
			int npcChoose = random.nextInt(3)+1;
		
			showPlayerChoose(npcName, npcChoose);
			
			//-- 3.2.��Һ�NPC�ĳ�ȭ�Ƚ�
			if(
				playChoose == 1 && npcChoose == 3 ||
				playChoose == 2 && npcChoose == 1 || 
				playChoose == 3 && npcChoose == 2
			){
				System.out.println("��Ӯ�˺�����");
				playScore += 1;
			}else{
				System.out.println("�����Զ��򲻹�!");
				npcScore += 1;
			}
			
			//-- ��Ϸ���� + 1;
			gameCount ++;
			
			//-- 3.3.��ʾ�Ƿ����
			System.out.println("�Ƿ�Ҫ��ʼ��һ��:\t");
			answer = scan.next();
		}		
		System.out.println("*******************************");
		//-- 4.��ʾ��ս�����ͻ���.
		System.out.println(playName + "VS" + npcName);
		System.out.println("��ս����:\t" + gameCount );
		System.out.println("����\t" + "\t�÷�");
		System.out.println(playName +"\t\t" + playScore);
		System.out.println(npcName +"\t\t" + npcScore);
		
		if(playScore > npcScore){
			System.out.println("��ð�!");
		}else{
			System.out.println("������������!");
		}		
	}
	
	
	/**
	 * ��ʾ��ҵ�ѡ��
	 * @param playName
	 * @param playChoose
	 */
	public static void showPlayerChoose(String playName,int playChoose) {
		String temp = "";
		switch(playChoose){
			case 1:
				temp = "����";
				break;
			case 2:
				temp = "ʯͷ";
				break;
			case 3:
				temp = "��";
				break;
			default:
				break;
			}
		System.out.println(playName + "��ȭ:\t" + temp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
