package carClient.Utils;

public class ShowFormatUtils {
	public static void showClientMenu() {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("����0�˳�");
		System.out.println("����1+������� �����⳵���� ��1+2");
		System.out.println("����2+1 ���۸������� 2+2 ���۸���������");
		System.out.println("����3+���ͱ�� ����������");
		System.out.println("����4+Ʒ�Ʊ�� ��Ʒ������");
		System.out.println("����5 ����ȫ������");
		System.out.println("����6 �鿴�ҵ��⳵��¼");
		System.out.println("����7+������� ����");
		System.out.println("-----------------------------------------------------------------");
	}
	public static void showAdminMenu() {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("����0�˳�");
		System.out.println("����1+������� �鿴�ƶ�����");
		System.out.println("����2+1 ���۸������� 2+2 ���۸���������");
		System.out.println("����3+���ͱ�� ����������");
		System.out.println("����4+Ʒ�Ʊ�� ��Ʒ������");
		System.out.println("����5 ����ȫ������");
		System.out.println("����6 �������");
		System.out.println("����7+������� �޸�������Ϣ");
		System.out.println("����8 �鿴������¼");
		System.out.println("-----------------------------------------------------------------");
	}
	public static void showWelcomeInfo() {
		System.out.println("===========================");
		System.out.println("��ӭ���ʶ����⳵");
		System.out.println("===========================");
	}
	public static void showCarQueryHeader() {
		String line = "---------------------------------------------------------------------------------";
		System.out.println(line+line+line+"\n��� \t ���� \t ��� \t Ʒ�� \t ���� \t\t �г���\t\t���޼�\t0����1������ 0�ϼ�1�¼�");
	}
	public static void showRecordQueryHeader() {
		String line = "---------------------------------------------------------------------------------";
		System.out.println(line+line+line+"\n��� \t ����\t ��� \t Ʒ�� \t ���� \t\t ������� \t �ܽ�� \t ÿ�����\t ��ʼ�� \t ������");
	}
	public static void main(String[] args) {
		showCarQueryHeader();
	}
}
