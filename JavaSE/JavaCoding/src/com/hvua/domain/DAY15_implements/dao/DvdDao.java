package com.hvua.domain.DAY15_implements.dao;

import com.hvua.domain.DAY15_implements.bean.Dvd;

public interface DvdDao {

	Dvd getDvds();

	boolean saveDvd(Dvd dvd);

	int findLastPos();

	int findIDPos(int dvdID);

	void delDvdSet(int dvdID);

	int dvdIDExists();

}
