package com.hvua.domain.D16_Exception;

import java.util.Random;

public class hw3_LiveOrDie {
	static Random random = new Random();
	static int health = random.nextInt(100) + 1;
	static int treatment = random.nextInt(50) + 1;

	/**
	 * ����
	 */
	public static void main(String[] args) {
		if (!worker(health)) {
			doctor(treatment);
		}

	}

	/**
	 * ������
	 * 
	 * @return
	 */
	public static boolean worker(int health) {
		try {
			System.out.println("��Ľ���ֵ��" + health);
			if (health <= 50) {
				throw new Exception();
			} else {
				System.out.println("��ܽ���Ŷ~");
				return true;
			}
		} catch (Exception e) {
			System.out.println("�����˰���");
			return false;
		}
	}

	/**
	 * ҽ��
	 */
	public static void doctor(int treatment) {
		System.out.println("������Ƴɹ�ֵ��" + treatment);
		try {
			if (treatment <= 20) {
				throw new Exception();
			} else {
				System.out.println("��ϲ�㣬�����ţ�");
			}
		} catch (Exception e) {
			System.out.println("����ʧ�ܣ������ɣ�");
		}
	}

}
