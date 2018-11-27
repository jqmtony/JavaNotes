package com.server.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.server.bean.Record;
import com.server.bean.User;
import com.server.dao.CarDao;
import com.server.dao.RecordDao;
import com.server.dao.impl.CarDaoImpl;
import com.server.dao.impl.RecordDaoImpl;
import com.server.service.RecordService;

public class RecordServiceImpl implements RecordService {
	
	RecordDao rd;
	CarDao cd ;
	public RecordServiceImpl (){
		rd = new RecordDaoImpl();
		cd = new CarDaoImpl();
	}

	@Override
	public ArrayList<Record> listRecord() {
		try {
			return rd.listRecord();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null ;
	}

	@Override
	public Record rentCar(Record record) {
		try {
			return rd.getRecord(record.getRecordUserId() , record.getCarBrandCategory().getCarId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null ;
	}

	@Override
	public List<Record> listRecord2(User user) {
		try {
			return rd.listRecord(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null ;
	}

	@Override
	public Record returnCar(Record record) {
		try {
			return rd.getRecord(record.getRecordUserId() , record.getCarBrandCategory().getCarId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null ;
	}

}
