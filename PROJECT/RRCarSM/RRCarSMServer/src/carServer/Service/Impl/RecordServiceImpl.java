package carServer.Service.Impl;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import carServer.Dao.RecordDao;
import carServer.Dao.Imp.RecordDaoImpl;
import carServer.Entity.Record;
import carServer.Service.RecordService;

/**
 * Record功能
 * 
 * @author 李文娟
 *
 */
public class RecordServiceImpl implements RecordService {
	RecordDao recordDao;

	public RecordServiceImpl() {
		recordDao = new RecordDaoImpl();
	}
	// 借车
	@Override
	public ArrayList<Record> rentRecord(String carId, String userId) throws SQLException, ParseException {
		return recordDao.getRentRecord(carId,userId);
	}
	// 还车 
	@Override
	public ArrayList<Record> returnRecord(String carId, String userId) throws SQLException, ParseException {
		return recordDao.getReturnRecord(carId,userId);
	}
	// 用户查看订单个人记录
	@Override
	public ArrayList<Record> listRecord(String userId) throws SQLException {
		return recordDao.listUserRecord(userId);
	}
	// 管理员查看所有订单
	@Override
	public ArrayList<Record> adminListRecord() throws SQLException {
		return recordDao.listRecord();
	}

}
