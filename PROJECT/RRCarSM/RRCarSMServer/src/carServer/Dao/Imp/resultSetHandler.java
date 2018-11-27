package carServer.Dao.Imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import carServer.Entity.Car;
import carServer.Entity.User;


/**
 * resultSetHandler 用于将访问数据库拿到的reusltSet转换为需要的类对象
 * @author Administrator
 *
 */
public interface resultSetHandler {
	/**
	 * 将ResultSet转换为User对象
	 * @throws SQLException 
	 */
	public List<User> userLoginHandler(ResultSet rSet) throws SQLException;

}
