package carServer.Dao.Imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import carServer.Dao.UserDao;
import carServer.Entity.User;
import carServer.Utils.JDBCUtils;

/**
 * ʹ��JDBC����Java��Ŀ��mySQL���ݿ������
 * 
 * @author Administrator
 *
 */
public class UserDaoImpl implements UserDao {
rSetUtils rSetUtils;
User addUser;
public UserDaoImpl() {
	rSetUtils = new rSetUtils();
	addUser = new User();
}
	/**
	 * �û���¼���ܣ���ȡUser�����ظ�Service�㣬Ҫô��UserҪô��null����Ҫ�������ݿ�
	 * 
	 * @throws SQLException
	 */
	@Override
	public User getUser(String userName, String userPwd) throws SQLException {
		String sql = "select * from user where userName = ? and passWord = ? ; ";
		return rSetUtils.getUser(sql, userName,userPwd);
	}

	/**
	 * ��¼service >> ����û�
	 * @throws SQLException 
	 */
	@Override
	public Boolean addUser(User user) throws SQLException {
		// �ж��û��Ƿ����
		String verify = "select * from user where userName = ? and passWord = ? ; ";
		if(rSetUtils.getUser(verify, user.getUserName(),user.getPassWord()).getUserName()==null) {
			String sql = "insert into user(userId,userName,passWord,sex,userIdNumber,tel,addr,type) values(?,?,?,?,?,?,?,?)";
			return rSetUtils.addUser(sql, user);
		}
		System.out.println("�û�����֤ʧ��");
		return false;
	}

}
