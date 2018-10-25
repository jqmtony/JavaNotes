package com.hvua.domain.D14_abstract_DVD;

import java.util.Arrays;
import java.util.Scanner;

public class DVDManager {

	Scanner scanner = new Scanner(System.in);
	private DVD[] array;
	private DVDDB[] dvdLend;
	private int size;

	/**
	 * ��ʼ������
	 * 
	 * @param initSize
	 */
	public DVDManager(int initSize) {
		array = new DVD[initSize];
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
//		System.out.println("����ʹ��addDVD���");
		// TODO ����ʹ�ø����±꣬�����޲ι�����ӵķ�ʽ
		enlarge();
		array[size] = dvd;
		size = size + 1;
		dvd.setId(size);
	}

	/**
	 * 2.�鿴DVD
	 */
	public void viewDVD() {
		for (DVD dvd : array) {
			if (dvd != null) {
				System.out.println(dvd);
			}
		}
	}

	/**
	 * 3.ɾ��DVD
	 */
	public void delDVD(int id) { // �������
		int index = findID(id);
		for (int j = index-1; j <size; j++) {
			array[j]=array[j+1];
		}
		array[size] = null; // ��������һ��Ԫ����Ȼ���
		size = size - 1;
		System.out.println("***********��ɾ��" + id + "��ǰsizeΪ" + size + "***********");
		viewDVD();
	}
	/**
	 * �ҵ�id��Ӧ�������±�
	 */
	public int findID(int id) {
		int index = 0;
		for(DVD dvd:array) {
			index++;
			if(dvd.getId()==id) {
				break;
			}
		}
		return index;
	}
	/**
	 * 4.���
	 */
	public void lendDVD(int id) {
		System.out.println("--------------��Ҫ�����dvd��Ϣ����---------------");
		int target = findID(id);
		int index = 0;
		for(DVD dvd: array) {
			if(dvd.getId()==target) {
				
			}
		}
	}

	@Override
	public String toString() {
		return "DVDManager [array=" + Arrays.toString(array) + ", size=" + size + "]";
	}

}
