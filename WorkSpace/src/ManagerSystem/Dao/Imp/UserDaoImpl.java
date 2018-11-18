package ManagerSystem.Dao.Imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import DBM_Day6_JDBC.JDBCUtils;
import ManagerSystem.Dao.UserDao;
import ManagerSystem.Domain.User;

/**
 * ʹ��JDBC����Java��Ŀ��mySQL���ݿ������
 * 
 * @author Administrator
 *
 */
public class UserDaoImpl implements UserDao, resultSetHandler {

	/**
	 * �û���¼���ܣ���ȡUser�����ظ�Service�㣬Ҫô��UserҪô��null����Ҫ�������ݿ�
	 * @throws SQLException 
	 */
	@Override
	public User getUser(String... params) throws SQLException {
		// �������ݿ�
		Connection connection = JDBCUtils.getConnection();
		// �������������ݿ⣺userID,userAccount,userName,userPwd
		String sql = "select * from user where userName = ? and userPwd = ? ";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		int paramsCount = preparedStatement.getParameterMetaData().getParameterCount();
		for (int i = 0; i < paramsCount; i++) {
			preparedStatement.setObject(i + 1, params[i]);
		}
		// �õ�mySQL��User����
		ResultSet rSet = preparedStatement.executeQuery();
		// ת��ΪJava��User����
		List<User> userList = this.userLoginHandler(rSet);
		// ���ؽ��ֵ
		if(userList.size()<=0) {
			return null;
		}
		return userList.get(0);
	}

	/**
	 * ��д���ݲ��resultSetHandler�ӿڣ�һ���������ת��Ϊ����Ҫ�����б�ķ���
	 */
	@Override
	public List<User> userLoginHandler(ResultSet rSet) throws SQLException {
		// ����һ���ͻ�List
		List<User> userList = new ArrayList<>();
		// �����е����ݰ��ֶ���һ��һ��ȡ����
		while (rSet.next()) {
			User user = new User();
			user.setUserName(rSet.getString("�û���"));
			user.setUserPwd(rSet.getString("����"));
		}
		return userList;
	}

}
