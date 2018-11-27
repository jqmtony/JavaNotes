package carServer.Dao.Imp;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import carServer.Dao.RecordDao;
import carServer.Entity.Record;

/**
 * Record数据实现
 * record_id,car_number,rent,payment,t_comments,brand_name,category_name,start_date,return_date
 * 
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
	 * 
	 * @throws ParseException
	 */
	@Override
	public ArrayList<Record> getRentRecord(String carId, String userId) throws SQLException, ParseException {
		// status=1
		String updStatus = "update car set status=1 where id=" + carId;
		rSetUtils.getUpdateResult(updStatus);
		// record +1 
		String updRecord = "insert into car_record(car_id, user_id, start_date) values(?,?,?)";
		rSetUtils.updRentRecord(updRecord, carId, userId);
		// Query
		String selRecord = "SELECT d.record_id,a.car_number,a.t_comments,b.brand_name,c.category_name,a.rent,d.payment,d.start_date,d.return_date from car a,car_brand b,car_category c,car_record d where a.brand_id=b.id and  a.category_id=c.id and a.id=d.car_id and d.car_id= ? and d.user_id=? and a.status=1";
		return rSetUtils.getRecordRentList(selRecord, carId, userId);
	}

	/**
	 * 还
	 * 
	 * @throws SQLException
	 * @throws ParseException
	 */
	@Override
	public ArrayList<Record> getReturnRecord(String carId, String userId) throws SQLException, ParseException {
		// status  = 0
		String updStatus = "update car set status=0 where id=" + carId;
		rSetUtils.getUpdateResult(updStatus);
		// return_date + payment
		String updReturnRecord = "update car_record set return_date= ? where car_id=? and user_id=?";
		if(rSetUtils.updReturnRecord(updReturnRecord, carId, userId)!=0) {
			System.out.println("还车成功！");
		}else {
			System.err.println("还车失败！");
		}
		// recordList
		String selRecord = "SELECT d.record_id,a.car_number,a.t_comments,b.brand_name,c.category_name,a.rent,d.payment,d.start_date,d.return_date from car a,car_brand b,car_category c,car_record d where a.brand_id=b.id and  a.category_id=c.id and a.id=d.car_id and d.car_id=? and d.user_id=?";
		return rSetUtils.getRecordList(selRecord, carId, userId);
	}
	
	// 查看用户租赁记录
	@Override
	public ArrayList<Record> listUserRecord(String userId) throws SQLException {
		String selRecord = "SELECT d.record_id,a.car_number,a.t_comments,b.brand_name,c.category_name,a.rent,d.payment,d.start_date,d.return_date from car a,car_brand b,car_category c,car_record d where a.brand_id=b.id and  a.category_id=c.id and a.id=d.car_id  and d.user_id="+userId;
		return rSetUtils.listAllRecord(selRecord);
	}

	// 管理员查看所有订单记录
	@Override
	public ArrayList<Record> listRecord() throws SQLException {
		String sql = "SELECT d.record_id,a.car_number,a.t_comments,b.brand_name,c.category_name,a.rent,d.payment,d.start_date,d.return_date from car a,car_brand b,car_category c,car_record d where a.brand_id=b.id and  a.category_id=c.id and a.id=d.car_id";
		return rSetUtils.listAllRecord(sql);
	}

}
