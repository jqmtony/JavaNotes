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
	 * 初始化操作
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
	 * 要实现的功能列表 TODO 最终实现控台增删改查借出归还退出
	 */
	public void function() {
		System.out.println("欢迎使用迷你DVD管理器");
		System.out.println("-------------------------------------------");
		System.out.println("1. 新增DVD");
		System.out.println("2. 查看DVD");
		System.out.println("3. 删除DVD");
		System.out.println("4. 借出DVD");
		System.out.println("5. 归还DVD");
		System.out.println("6. 退   出");
		System.out.println("-------------------------------------------");
		System.out.print("请选择： ");
		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			System.out.println("---> 新增DVD");
			break;
		case 2:
			System.out.println("---> 查看DVD");
			break;
		case 3:
			System.out.println("---> 删除DVD");
			break;
		case 4:
			System.out.println("---> 借出DVD");
			break;
		case 5:
			System.out.println("---> 归还DVD");
			break;
		case 6:
			System.out.println("---> 退   出");
			break;
		default:
			System.out.println("无法识别你的选择，请重新输入！");
			break;
		}
	}

	/**
	 * 扩容
	 */
	public void enlarge() {
		if ((double) size / array.length >= 0.5) {
			array = Arrays.copyOf(array, (int) (array.length * 1.5));
		}
	}

	/**
	 * 1.新增DVD
	 */
	public void addDVD(DVD dvd) {
		// System.out.println("请先使用addDVD添加");
		// TODO 尝试使用告诉下标，利用无参构造添加的方式
		enlarge();
		array[size] = dvd;
		size = size + 1;
		dvd.setId(size);
	}

	/**
	 * 2.查看DVD（存留、借出）
	 */
	public void viewDVD() {
		System.out.println("****************存留目录****************");
		for (DVD dvd : array) {
			if (dvd != null) {
				System.out.println(dvd);
			}
		}
	}

	public void viewLend() {
		System.out.println("****************借出目录****************");
		for (DVD dvdLend : dvdLend) {
			if (dvdLend != null) {
				System.out.println(dvdLend);
			}
		}
	}

	/**
	 * 3.删除DVD
	 */
	public void delDVD(int id) { // 输入序号
		int index = findPos(id);
		for (int j = index - 1; j < size; j++) {
			array[j] = array[j + 1];
		}
		array[size] = null; // 本来最后的一个元素自然清除
		size = size - 1;
		System.out.println("[ 已删除" + id + "当前size为" + size + " ] ");
		viewDVD();
	}

	public void delDVDLend(int id) { // 输入序号
		int index = findPos(id);
		for (int j = index - 1; j < sizeLend; j++) {
			dvdLend[j] = dvdLend[j + 1];
		}
		sizeLend = sizeLend - 1;
		dvdLend[sizeLend] = null;
		viewLend();
	}

	/**
	 * 找到id对应的数组下标
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
	 * 4.借出
	 */
	public void lendDVD(int id) {
		dvdLend[sizeLend] = array[findPos(id) - 1]; // 存留→借出
		dvdLend[sizeLend].setLendCount(dvdLend[sizeLend].getLendCount() + 1); // 出借次数+1
		dvdLend[sizeLend].setStatus(false);
		sizeLend = sizeLend + 1;
		viewLend();
		delDVD(id);
	}

	/**
	 * 5.还入
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
