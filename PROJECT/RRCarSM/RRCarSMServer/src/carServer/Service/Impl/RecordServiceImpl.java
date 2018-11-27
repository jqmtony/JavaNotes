package carServer.Service.Impl;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import carServer.Dao.RecordDao;
import carServer.Dao.Imp.RecordDaoImpl;
import carServer.Entity.Record;
import carServer.Service.RecordService;

/**
 * Record����
 * 
 * @author ���ľ�
 *
 */
public class RecordServiceImpl implements RecordService {
	RecordDao recordDao;

	public RecordServiceImpl() {
		recordDao = new RecordDaoImpl();
	}
	// �賵
	@Override
	public ArrayList<Record> rentRecord(String carId, String userId) throws SQLException, ParseException {
		return recordDao.getRentRecord(carId,userId);
	}
	// ���� 
	@Override
	public ArrayList<Record> returnRecord(String carId, String userId) throws SQLException, ParseException {
		return recordDao.getReturnRecord(carId,userId);
	}
	// �û��鿴�������˼�¼
	@Override
	public ArrayList<Record> listRecord(String userId) throws SQLException {
		return recordDao.listUserRecord(userId);
	}
	// ����Ա�鿴���ж���
	@Override
	public ArrayList<Record> adminListRecord() throws SQLException {
		return recordDao.listRecord();
	}

}
