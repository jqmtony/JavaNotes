package com.server.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.server.bean.Record;
import com.server.bean.User;
import com.server.dao.RecordDao;
import com.server.service.impl.Utils;

public class RecordDaoImpl implements RecordDao {

	@Override
	public ArrayList<Record> listRecord() throws SQLException, Exception {
		ResultSet rs = Utils.SelcetData("select * from t_record");
		return Utils.resultToRecordList(rs);
	}

	@Override
	public Record getRecord(int recordUserId, String carId) throws SQLException, Exception {
		ResultSet rs = Utils.SelcetData("select * from t_record where user_id = ? and car_id  = ?",
				recordUserId , carId);
		return Utils.resultToRecord(rs);
	}

	@Override
	public List<Record> listRecord(User user) throws SQLException, Exception {
		ResultSet rs = Utils.SelcetData("select * from t_record where user_id = ?", user.getUserId());
		return Utils.resultToRecordList(rs);
	}

}
