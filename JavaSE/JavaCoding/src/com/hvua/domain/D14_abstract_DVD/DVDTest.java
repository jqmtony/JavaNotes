package com.hvua.domain.D14_abstract_DVD;

public class DVDTest {
	public static void main(String[] args) {
		DVD d1 = new DVD(1,"�������", 0, null, "�ɽ�");
		DVD d2 = new DVD(1, "�������", 0, null, "�ɽ�");
		DVD d3 = new DVD(1, "��������", 0, null, "�ɽ�");
		DVD d4 = new DVD(1, "���ֵ���", 0, null, "�ɽ�");
		DVD d5 = new DVD(1, "�������", 0, null, "�ɽ�");
		DVD d6 = new DVD(1, "��������", 0, null, "�ɽ�");
		DVD d7 = new DVD(1, "���ֵ���", 0, null, "�ɽ�");
		// ����DVD������DVD
		// TODO ��̬���� ---> DVDDB
		DVDManager dManager = new DVDManager(2);
		DVDManager dMLend = new DVDManager(2);
		// ���DVD
		dManager.addDVD(d1);
		dManager.addDVD(d2);
		dManager.addDVD(d3);
		dManager.addDVD(d4);
		dManager.addDVD(d5);
		dManager.addDVD(d6);
		dManager.addDVD(d7);
		// �鿴DVD
		dManager.viewDVD();
		// ɾ��DVD
		dManager.delDVD(6);
		dManager.delDVD(3);
		// ���DVD
		dManager.lendDVD(5);
	}
}
