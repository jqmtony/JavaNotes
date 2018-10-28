package com.hvua.domain.DAY15_implements.daoImpl;

import com.hvua.domain.DAY15_implements.Tools.DataSet;
import com.hvua.domain.DAY15_implements.bean.Dvd;
import com.hvua.domain.DAY15_implements.dao.DvdDao;

public class DvdDaoImp implements DvdDao {
	Dvd[] array = DataSet.arrayDvd; // 获取数据源

	@Override
	// TODO 返回值怎么设置？
	public Dvd getDvds() {
		for (Dvd dvd : array) {
			if (dvd != null) {
				System.out.println(dvd);
			}
		}
		return null;
	}

	@Override
	public boolean saveDvd(Dvd dvd) {
		array[findLastPos()] = dvd;
		return true;
	}

	/**
	 * 找到数组的第一个空值下标
	 */
	@Override
	public int findLastPos() {
		int pos = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	@Override
	public int findIDPos(int dvdID) {
		int index = 0;
		for (Dvd dvd : array) {
			if (dvd.getDvdID() == dvdID) {
				return index;
			}
			index++;
		}
		return -1;
	}

	@Override
	public void delDvdSet(int dvdID) {
		for (int i = findIDPos(dvdID); i < array.length; i++) {
			if (array[i] != null) {
				array[i] = array[i + 1];
			}
		}

	}

	@Override
	public int dvdIDExists() {
		int dvdID = findLastPos();
		return dvdID + 2;
	}

}
