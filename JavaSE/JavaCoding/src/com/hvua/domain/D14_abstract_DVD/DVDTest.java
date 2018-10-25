package com.hvua.domain.D14_abstract_DVD;

public class DVDTest {
	public static void main(String[] args) {
		DVD d1 = new DVD(1,"罗马假日", 0, "可借", true);
		DVD d2 = new DVD(1, "风声鹤唳", 0, "可借",  true);
		DVD d3 = new DVD(1, "浪漫满屋", 0, "可借",  true);
		DVD d4 = new DVD(1, "快乐当家", 0, "可借",  true);
		DVD d5 = new DVD(1, "风声鹤唳", 0, "可借",  true);
		DVD d6 = new DVD(1, "浪漫满屋", 0, "可借",  true);
		DVD d7 = new DVD(1, "快乐当家", 0, "可借",  true);
		// 创建DVD数组存放DVD
		// TODO 动态数组 ---> DVDDB
		DVDManager dManager = new DVDManager(2);
		DVDManager dvdLend = new DVDManager(2);
		// 添加DVD
		dManager.addDVD(d1);
		dManager.addDVD(d2);
		dManager.addDVD(d3);
//		dManager.addDVD(d4);
		dManager.addDVD(d5);
		dManager.addDVD(d6);
		dManager.addDVD(d7);
		// 查看DVD
//		dManager.viewDVD();
		// 删除DVD
//		dManager.delDVD(6);
//		dManager.delDVD(3);
		// 借出DVD
		dManager.lendDVD(4);
		// 还入DVD
		dManager.backDVD(4);
		
	}
}
