import java.util.Scanner;

/* 16.	�û���¼��֤����֤�������3��  */

class login {
	public static void main(String[] args) {
		// ��½��֤
		String str1 = "Jim";
		int int1 = 12345;
		for(int i=1;i<4;i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("�������û�����");
			String name = scan.nextLine();
			// int name = scan.nextInt();
			System.out.print("���������룺");
			int password = scan.nextInt();
			if((name.equals(str1))&&(password.equals(int1))) {
				System.out.println("��ӭ��½NyShoppingϵͳ��");
				break;
			}else {
				System.out.println("�������������"+(3-i)+"һ�λ���");
			}
			if(i==3){
				System.out.println("�Բ�����3�ξ��������");
			}
		}
	}
}
