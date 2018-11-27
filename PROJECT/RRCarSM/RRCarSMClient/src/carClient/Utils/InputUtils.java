package carClient.Utils;
/**
 * �ṩScanner�������ṩ�쳣�����������ʾ��
 * @author ���ľ�
 *
 */

import java.util.Scanner;

import carClient.Entity.insertCar;

public class InputUtils {
	protected static Scanner myInput;
	public InputUtils() {
		myInput = new Scanner(System.in);
		}

	/**
	 * ��ȡ�ַ���
	 */
	public String myInputString() {
		String result = myInput.next();
		return result;
	}
	/**
	 * ��ȡ����
	 */
	public int myInputInt() {
		int result = myInput.nextInt();
		return result;
	}
	/**
	 * ��ȡdouble����
	 */
	public static double myInputDouble() {
		double result = myInput.nextDouble();
		return result;
	}
	/**
	 * ��ȡ�û���
	 * @return 
	 */
	public String inputUserName() {
		System.out.println("�������û�����");
		String name = myInput.next();
		return name;
	} 
	/**
	 * ��ȡ�û�����
	 * @return 
	 */
	public String inputUserPwd() {
		System.out.println("���������룺");
		String pwd = myInput.next();
		return pwd;
	} 
	/**
	 * ��ӳ�
	 */
	public static insertCar adminAddCar() {
		insertCar car = new insertCar();
		System.out.println("�����복�ƺţ�");
		car.setCar_number(myInput.next());
		System.out.println("������Ʒ��id�ţ����֣���");
		car.setBrand_id(myInput.nextInt());
		System.out.println("���������ͣ�T����");
		car.setModel(myInput.next());
		System.out.println("��������ɫ��");
		car.setColor(myInput.next());
		System.out.println("���������id�ţ����֣���");
		car.setCategory_id(myInput.nextInt());
		System.out.println("�������飺");
		car.setT_comments(myInput.next());
		System.out.println("�������г��۸����֣���");
		car.setPrice(myInputDouble());
		System.out.println("��������𣨰�����㣩��");
		car.setRent(myInputDouble());
		System.out.println("�Ƿ���� 0.�ɽ� 1.�ѽ��");
		car.setStatus(myInput.nextInt());
		System.out.println("�Ƿ��ϼ� 0.�ϼ� 1.���ϼ�");
		car.setUseable(myInput.nextInt());
	return car;
	}
	// ���³�����Ϣ
	public String getUpdInfo() {
		String result = null;
		System.out.println("��ѡ���޸��1. ��� 2.�ϼ�/�¼�");
		int choose = myInputInt();
		if(choose==1) {
			System.out.println("�������޸Ľ�");
			double rent = myInputDouble();
			result = 1+"#"+rent;
		}else if(choose==2) {
			System.out.println("0.�ϼ� 1.�¼�");
			int useable = myInputInt();
			 result = 2+"#" + useable;
		}
		return result;
	}
}
