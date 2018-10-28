package com.hvua.domain.DAY15_implements.serviceImpl;

import com.hvua.domain.DAY15_implements.bean.Dvd;
import com.hvua.domain.DAY15_implements.dao.DvdDao;
import com.hvua.domain.DAY15_implements.daoImpl.DvdDaoImp;
import com.hvua.domain.DAY15_implements.service.DvdService;

public class DvdServiceImpl implements DvdService {
	DvdDao dvdDao = new DvdDaoImp();

	@Override
	public boolean showAll() {
		// 业务层 --> 数据层 --> 数据库
		return dvdDao.getDvds() != null;
	}

	@Override
	public boolean addDvd(String name) {
		Dvd dvd = new Dvd(createDvdID(), name);
		return dvdDao.saveDvd(dvd);
	}

	private int createDvdID() {
		return dvdDao.dvdIDExists();
	}

	@Override
	public boolean delDvd(int dvdID) {
		if (dvdDao.findIDPos(dvdID) != -1) {
			dvdDao.delDvdSet(dvdID);
			return true;
		} else {
			return false;
		}
	}
}
