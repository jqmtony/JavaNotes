package com.hvua.domain.D14_abstract_DVD;

public class DVDTest {
	public static void main(String[] args) {
		DVD d1 = new DVD(1,"�������", 0, "�ɽ�", true);
		DVD d2 = new DVD(1, "�������", 0, "�ɽ�",  true);
		DVD d3 = new DVD(1, "��������", 0, "�ɽ�",  true);
		DVD d4 = new DVD(1, "���ֵ���", 0, "�ɽ�",  true);
		DVD d5 = new DVD(1, "�������", 0, "�ɽ�",  true);
		DVD d6 = new DVD(1, "��������", 0, "�ɽ�",  true);
		DVD d7 = new DVD(1, "���ֵ���", 0, "�ɽ�",  true);
		// ����DVD������DVD
		// TODO ��̬���� ---> DVDDB
		DVDManager dManager = new DVDManager(2);
		DVDManager dvdLend = new DVDManager(2);
		// ���DVD
		dManager.addDVD(d1);
		dManager.addDVD(d2);
		dManager.addDVD(d3);
//		dManager.addDVD(d4);
		dManager.addDVD(d5);
		dManager.addDVD(d6);
		dManager.addDVD(d7);
		// �鿴DVD
//		dManager.viewDVD();
		// ɾ��DVD
//		dManager.delDVD(6);
//		dManager.delDVD(3);
		// ���DVD
		dManager.lendDVD(4);
		// ����DVD
		dManager.backDVD(4);
		
	}
}
