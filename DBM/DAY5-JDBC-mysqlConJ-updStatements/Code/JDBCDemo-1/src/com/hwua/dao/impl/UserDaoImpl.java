package com.hwua.dao.impl;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hwua.dao.UserDao;
import com.hwua.domain.User;
import com.hwua.util.JDBCUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean addUser(User u) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * ' Statement
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static boolean method1() throws SQLException {

		// -- 1.��ȡ����
		Connection con = JDBCUtils.getConnection();

		// -- 2.ͨ�����ӻ�ȡ�������Statement ������û�в�����.
		Statement statement = con.createStatement();

		// -- 3.�ṩҪִ�е�sql���
		String sql = "update _user set id = 3 where name = '����' and sex = 1";

		// -- 4.������Statement��ִ�� .���ص���Ӱ�������.
		int result = statement.executeUpdate(sql);

		return result != 0;
	}

	/**
	 * ' ʹ��PreparedStatement
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static boolean method2() throws SQLException {

		// -- 1.��ȡ����
		Connection con = JDBCUtils.getConnection();
		// -- 2.�ṩҪִ�е�sql��� ? ��ռλ��.
		String sql = "update _user set sex = ? where id = ?";
		// -- 3.ͨ�����ӻ�ȡPreparedStatement����
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		// -- 4.��ռλ����ֵ ռλ�����±��1��ʼ
		preparedStatement.setBoolean(1, false);
		preparedStatement.setInt(2, 3);
		// -- 5.ִ��sql���.
		int result = preparedStatement.executeUpdate();
		return result != 0;
	}

	public static void method3() throws SQLException {

		// -- 1 ��������
		Connection conn = JDBCUtils.getConnection();
		// -- 2.�ṩҪִ�еĲ�ѯ���
		String sql = "select id,name,sex from _user";
		// -- 3.ͨ��Connection����ȡPreparedStatement Ctrl + 1
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		// -- 4.�滻ռλ��
		// -- 5.ִ��sql��� �õ������
		ResultSet rSet = preparedStatement.executeQuery();
		// -- 6.�������һ����ʱ��.�к���.������Ҫ����User����.������Ҫ���������
		List<User> list = new ArrayList<>();
		while (rSet.next()) {
			User u = new User();
			u.setUserId(rSet.getInt("id"));
			u.setUserName(rSet.getString("name"));
			u.setUserSex(rSet.getBoolean("sex"));
			list.add(u);
		}

		// -- ���ԶԼ��Ͻ��б���
		for (User user : list) {
			System.out.println(user);
		}
	}

	/**
	 * '���ͺ���
	 * 
	 * @param sql
	 * @return
	 * @throws SQLException 
	 */
	public static boolean updateObject(String sql,Object... params) throws SQLException {
		// -- 1 ��������
		Connection conn = JDBCUtils.getConnection();
		System.out.println(conn);
		// -- 3.ͨ��Connection����ȡPreparedStatement Ctrl + 1
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		// -- 4.�滻ռλ��
		// -- ʹ��Ԫ����metadata����ȡsql�����ռλ��������
		ParameterMetaData metaData = preparedStatement.getParameterMetaData();
		System.out.println("ռλ������:\t"+metaData.getParameterCount());
		//-- ������ֵռλ��
		for (int i = 0; i < metaData.getParameterCount(); i++) {
			preparedStatement.setObject(i+1, params[i]);
		}		
		//-- ִ��sql���		
		return preparedStatement.executeUpdate() != 0;
	}

	public static void main(String[] args) {
		try {
			String sql = "insert into score values(?,?,?)";
			updateObject(sql,99,99,99);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
