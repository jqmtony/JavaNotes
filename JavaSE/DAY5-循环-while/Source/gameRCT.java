import java.util.Scanner;
import java.util.Random;

/* 
	���̲ο���
	1.��Ϸ����
	2.���������ʼ��
	3. �ظ�����
		3.1��ҳ�ȭ��NPC�������ȭ
		3.2�Ƚ�
		3.3��ʾ�Ƿ����
	4.��ʾ��ս�����ͻ���
 */

class gameRCT {
	public static void main(String[] args) {
		// ����Scanner��Random
		Scanner scan = new Scanner(System.in);
		Random random=new Random();
		
		//-- 1.��Ϸ����
		System.out.println("\n\n\t\t\t*************************");
		System.out.println("\t\t\t********��ȭ����ʼ********");
		System.out.println("\t\t\t*************************\n\n");
		
		System.out.println("��ȭ����1.���� 2.ʯͷ 3.��");
		
		/* ������쳣���������whileʵ�֣����忴D5/Code/GameGuess */
		
		//-- 2.���������ʼ��
		System.out.print("��ѡ��Է���ɫ��1.���� 2.��Ȩ 3.�ܲ٣�");
		int role = scan.nextInt();
		
		System.out.print("������������֣�");
		String name = scan.next();
		
		String roleB = "";
		switch(role){
			case 1:
				roleB = "����";
				break;
			case 2:
				roleB = "��Ȩ";
				break;
			case 3:
				roleB = "�ܲ�";
				break;
			default:
				// �����
				;
				break;
		}
		
		System.out.println(name+" VS "+roleB);
		
		//-- 3.�ظ�����
		System.out.print("Ҫ��ʼ��(y/n)��");
		String ifnext = scan.next();
		
		int playA = 1;
		int playB = 1;
		int count = 0;
		int scoreA = 0;
		int scoreB = 0;
		
		//-- 3.1 ��ҳ�ȭ��NPC�������ȭ
		for(;"y".equals(ifnext);) {
			System.out.println("*************************");
			System.out.print("���ȭ\t��1.���� 2.ʯͷ 3.����");
			playA = scan.nextInt();
			
			String playAout = "";
			switch(playA) {
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
					;
					break;
			}
			System.out.println("\n���ȭ��\t"+temp);
			
			playB = random.nextInt(3)+1;
			String playBout = "";
			switch(playB) {
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
					;
					break;
			}
			System.out.println(roleB+"��ȭ��\t"+temp+"\n");
			
			//-- 3.2�Ƚ�
			if(playA==1&&playB==3){
				scoreA++;
				System.out.println("�ۣ���Ӯ�ˣ���������");
			}else if(playA==3&&playB==1){
				scoreB++;
				System.out.println("���������ˣ��ÿ��£�");
			}else if(playA == playB){
				System.out.println("��������ƽ�ֿ���");
			}else if(playA > playB) {
				scoreA++;
				System.out.println("�ۣ���Ӯ�ˣ���������");
			}else{
				scoreB++;
				System.out.println("���������ˣ��ÿ��£�");
			}
			
			//-- 3.3��ʾ�Ƿ����
			System.out.print("�Ƿ�ʼ��һ��(y/n)��");
			ifnext = scan.next();
			System.out.println("\n*************************\n");
			
			//-- 4.��ʾ��ս�����ͻ���
			if("y".equals(ifnext)) {
				count++;
				continue;
			}else {
				System.out.println("*************************");
				System.out.println(name+"\tVS\t"+roleB);
				System.out.println("��ս����\t"+count);
				System.out.println("����\t\t"+"�÷�");
				System.out.println(roleB+"\t\t"+scoreB);
				System.out.println(name+"\t\t"+scoreA);
			}
			
			if(scoreA>scoreB){System.out.println("�ۣ���ð���");}
		}
		
	}
}