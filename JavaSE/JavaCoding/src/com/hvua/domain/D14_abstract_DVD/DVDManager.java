package com.hvua.domain.D14_abstract_DVD;

import java.util.Arrays;
import java.util.Scanner;

public class DVDManager {

	Scanner scanner = new Scanner(System.in);
	private DVD[] array;
	private DVD[] dvdLend;
	private int size;
	private int sizeLend;

	/**
	 * ��ʼ������
	 * 
	 * @param initSize
	 */
	public DVDManager(int initSize) {
		array = new DVD[initSize];
		dvdLend = new DVD[initSize];
	}

	/**
	 * get and set
	 * 
	 * @return
	 */
	public DVD[] getArray() {
		return array;
	}

	public int getSize() {
		return size;
	}

	public int getSizeLend() {
		return sizeLend;
	}

	/**
	 * Ҫʵ�ֵĹ����б� TODO ����ʵ�ֿ�̨��ɾ�Ĳ����黹�˳�
	 */
	public void function() {
		System.out.println("��ӭʹ������DVD������");
		System.out.println("-------------------------------------------");
		System.out.println("1. ����DVD");
		System.out.println("2. �鿴DVD");
		System.out.println("3. ɾ��DVD");
		System.out.println("4. ���DVD");
		System.out.println("5. �黹DVD");
		System.out.println("6. ��   ��");
		System.out.println("-------------------------------------------");
		System.out.print("��ѡ�� ");
		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			System.out.println("---> ����DVD");
			break;
		case 2:
			System.out.println("---> �鿴DVD");
			break;
		case 3:
			System.out.println("---> ɾ��DVD");
			break;
		case 4:
			System.out.println("---> ���DVD");
			break;
		case 5:
			System.out.println("---> �黹DVD");
			break;
		case 6:
			System.out.println("---> ��   ��");
			break;
		default:
			System.out.println("�޷�ʶ�����ѡ�����������룡");
			break;
		}
	}

	/**
	 * ����
	 */
	public void enlarge() {
		if ((double) size / array.length >= 0.5) {
			array = Arrays.copyOf(array, (int) (array.length * 1.5));
		}
	}

	/**
	 * 1.����DVD
	 */
	public void addDVD(DVD dvd) {
		// System.out.println("����ʹ��addDVD���");
		// TODO ����ʹ�ø����±꣬�����޲ι�����ӵķ�ʽ
		enlarge();
		array[size] = dvd;
		size = size + 1;
		dvd.setId(size);
	}

	/**
	 * 2.�鿴DVD�������������
	 */
	public void viewDVD() {
		System.out.println("****************����Ŀ¼****************");
		for (DVD dvd : array) {
			if (dvd != null) {
				System.out.println(dvd);
			}
		}
	}

	public void viewLend() {
		System.out.println("****************���Ŀ¼****************");
		for (DVD dvdLend : dvdLend) {
			if (dvdLend != null) {
				System.out.println(dvdLend);
			}
		}
	}

	/**
	 * 3.ɾ��DVD
	 */
	public void delDVD(int id) { // �������
		int index = findPos(id);
		for (int j = index - 1; j < size; j++) {
			array[j] = array[j + 1];
		}
		array[size] = null; // ��������һ��Ԫ����Ȼ���
		size = size - 1;
		System.out.println("[ ��ɾ��" + id + "��ǰsizeΪ" + size + " ] ");
		viewDVD();
	}

	public void delDVDLend(int id) { // �������
		int index = findPos(id);
		for (int j = index - 1; j < sizeLend; j++) {
			dvdLend[j] = dvdLend[j + 1];
		}
		sizeLend = sizeLend - 1;
		dvdLend[sizeLend] = null;
		viewLend();
	}

	/**
	 * �ҵ�id��Ӧ�������±�
	 */
	public int findPos(int id) {
		int index = 0;
		for (DVD dvd : array) {
			index++;
			if (dvd.getId() == id) {
				break;
			}
		}
		return index;
	}

	public int findLendPos(int id) {
		int index = 0;
		for (DVD dvdLend : dvdLend) {
			index++;
			if (dvdLend.getId() == id) {
				break;
			}
		}
		return index;
	}

	/**
	 * 4.���
	 */
	public void lendDVD(int id) {
		dvdLend[sizeLend] = array[findPos(id) - 1]; // ���������
		dvdLend[sizeLend].setLendCount(dvdLend[sizeLend].getLendCount() + 1); // �������+1
		dvdLend[sizeLend].setStatus(false);
		sizeLend = sizeLend + 1;
		viewLend();
		delDVD(id);
	}

	/**
	 * 5.����
	 */
	public void backDVD(int id) {
		array[size] = dvdLend[findLendPos(id) - 1];
		array[size].setStatus(true);
		size = size + 1;
		delDVDLend(id);
		viewDVD();
	}

	@Override
	public String toString() {
		return "DVDManager [array=" + Arrays.toString(array) + ", size=" + size + "]";
	}

}
