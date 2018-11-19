package com.server.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.server.bean.Record;
import com.server.bean.User;

public interface RecordDao {

	ArrayList<Record> listRecord() throws SQLException, Exception;

	Record getRecord(int recordUserId, String carId) throws SQLException, Exception;

	List<Record> listRecord(User user) throws SQLException, Exception;

}
