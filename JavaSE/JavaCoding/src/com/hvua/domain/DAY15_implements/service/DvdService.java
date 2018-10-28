package com.hvua.domain.DAY15_implements.service;

public interface DvdService {

	int SHOW_ALL_DVD = 1;
	int ADD_DVD = 2;
	int DEL_DVD = 3;
	int LEND_DVD = 4;
	int BACK_DVD = 5;
	boolean showAll();
	boolean addDvd(String name);
	boolean delDvd(int dvdID);

}
