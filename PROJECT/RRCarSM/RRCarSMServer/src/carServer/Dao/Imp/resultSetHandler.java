package carServer.Dao.Imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import carServer.Entity.Car;
import carServer.Entity.User;


/**
 * resultSetHandler ���ڽ��������ݿ��õ���reusltSetת��Ϊ��Ҫ�������
 * @author Administrator
 *
 */
public interface resultSetHandler {
	/**
	 * ��ResultSetת��ΪUser����
	 * @throws SQLException 
	 */
	public List<User> userLoginHandler(ResultSet rSet) throws SQLException;

}
