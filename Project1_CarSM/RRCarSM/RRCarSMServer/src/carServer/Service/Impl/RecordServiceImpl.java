package carServer.Service.Impl;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import carServer.Dao.RecordDao;
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
	public ArrayList<Record> rentCar(String carId, String userId) throws SQLException, ParseException {
		return recordDao.getRentRecord(carId,userId);
	}
	// 还车 
	@Override
	public ArrayList<Record> returnCar(String carId, String userId) throws SQLException, ParseException {
		return recordDao.getReturnRecord(carId,userId);
	}

}
