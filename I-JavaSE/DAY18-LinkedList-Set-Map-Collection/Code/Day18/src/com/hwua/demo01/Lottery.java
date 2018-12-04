package com.hwua.demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * ' ��Ʊ��
 * 
 * @author Administrator
 *
 */
public class Lottery {
	// -- ��¼�ں�
	private int stage;

	public int getStage() {
		return stage;
	}

	public void setStage(int stage) {
		this.stage = stage;
	}

	/**
	 * �ṩ�����������ƺ��������ĸ���
	 */
	private static final int MAX_RED = 6;

	// -- ע��.Ŀ���Ǻ��� unused�ľ���
	@SuppressWarnings("unused")
	private static final int MAX_BLUE = 1;

	private Random random;
	/**
	 * '�ṩ��������6��ȡֵ1-33�ĺ���
	 */
	private ArrayList<Integer> reds;

	// -- �ṩһ����������ÿһ�ڵ�����
	private int blue;

	/**
	 * ' �ṩ�����get����
	 * 
	 * @return
	 */
	public ArrayList<Integer> getReds() {
		return reds;
	}

	public int getBlue() {
		return blue;
	}

	/**
	 * '���ù��췽����ɺ���ĳ�ʼ������
	 */
	public Lottery(int stage) {
		this.stage = stage;
		initLottery();
	}

	/**
	 * '��ʼ������
	 */
	public void initLottery() {
		// -- ʵ�����������ļ���
		reds = new ArrayList<>();
		random = new Random();
		createRed();
		createBlue();
	}

	/**
	 * '���ɺ���
	 */
	public void createRed() {
		// -- ���ɺ��򲢷��뼯��
		for (int i = 0; i < MAX_RED; i++) {
			// -- ȡֵ��Χ1-33
			Integer ball = random.nextInt(33) + 1;
			if (reds.contains(ball)) {
				i--;
				continue;
			}
			reds.add(ball);
		}
		// -- ��������������ĵ��¼�����Ԫ�ص�˳���������.����
		Collections.sort(reds);
	}

	/**
	 * ' ��������
	 */
	public void createBlue() {
		// -- ȡֵ 1-16
		blue = random.nextInt(16) + 1;
	}

	/**
	 * ' ��ʽ����ӡ!
	 */
	@Override
	public String toString() {
		String line = "��" + stage + "�ڲ�Ʊ����:\t";
		for (int i = 0; i < reds.size(); i++) {
			if (reds.get(i) < 10) {
				line = line + "0" + reds.get(i) + " ";
			} else {
				line = line + reds.get(i) + " ";
			}
		}
		line = line + blue;
		return line;
	}
}
