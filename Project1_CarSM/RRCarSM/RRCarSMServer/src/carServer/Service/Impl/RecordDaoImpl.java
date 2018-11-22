package carServer.Service.Impl;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import carServer.Dao.RecordDao;
import carServer.Dao.Imp.rSetUtils;
import carServer.Entity.Record;

/**
 * Record数据实现
 * record_id,car_number,rent,payment,t_comments,brand_name,category_name,start_date,return_date
 * @author 李文娟
 *
 */
public class RecordDaoImpl implements RecordDao {
	rSetUtils rSetUtils;
	ArrayList<Record> recordList;
	public RecordDaoImpl() {
		rSetUtils = new rSetUtils();
		recordList = new ArrayList<>();
	}

	/**
	 * 借
	 * @throws ParseException 
	 */
	@Override
	public ArrayList<Record> getRentRecord(String carId, String userId) throws SQLException, ParseException {
		// 更新Record表中的user_id, car_id, start_date
		String updRecord = "insert into car_record(user_id, car_id, start_date) values(?,?,?)";
		if(rSetUtils.updRentRecord(updRecord, carId, userId)==1) {
			System.out.println("[服务器][RecordDaoImpl]>>>已更新Record表，借车成功！");
			// 修改Status
			String updStatus = "update car set status=1 where id=" + carId;
			if(rSetUtils.getUpdateResult(updStatus)==1) {
				System.out.println("[服务器][RecordDaoImpl]>>>已更新Status状态为1");
			}
		}
		// 返回查询结果并赋值Record对象（三表查询）
		String selRecord = "SELECT d.record_id,a.car_number,a.t_comments,b.brand_name,c.category_name,a.rent,d.payment,d.start_date,d.return_date from car a,car_brand b,car_category c,car_record d where a.brand_id=b.id and  a.category_id=c.id and a.id=d.car_id and d.user_id=" + userId;
		return rSetUtils.getRecordList(selRecord);
	}
	
	/**
	 * 还
	 * @throws SQLException 
	 * @throws ParseException 
	 */
	@Override
	public ArrayList<Record> getReturnRecord(String carId, String userId) throws SQLException, ParseException {
		// 匹配用户和并更新return_date
		String updReturnRecord = "update car_record set return_date= ? where car_id=? and user_id=?";
		if(rSetUtils.updReturnRecord(updReturnRecord, carId, userId)!=0) {
			System.out.println("[服务器][RecordDaoImpl]>>>已更新Record表，还车成功！");
			// 修改Status
			String updStatus = "update car set status=0 where id=" + carId;
			if(rSetUtils.getUpdateResult(updStatus)!=0) {
				System.out.println("[服务器][RecordDaoImpl]>>>已更新Status状态为0");
			}
		}
		// 返回查询结果
		String selRecord = "SELECT d.record_id,a.car_number,a.t_comments,b.brand_name,c.category_name,a.rent,d.payment,d.start_date,d.return_date from car a,car_brand b,car_category c,car_record d where a.brand_id=b.id and  a.category_id=c.id and a.id=d.car_id and d.user_id=" + userId;
		return rSetUtils.getRecordList(selRecord);
	}
	/**
	 * 测试
	 * @throws SQLException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws SQLException, ParseException {
		RecordDaoImpl recordDaoImpl = new RecordDaoImpl();
		recordDaoImpl.getReturnRecord("2", "3");
	}

}
