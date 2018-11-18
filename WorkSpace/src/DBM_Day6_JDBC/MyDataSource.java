package DBM_Day6_JDBC;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.sql.DataSource;

public class MyDataSource implements DataSource {
	/**
	 * ʵ�����ӳأ��������ӳ�arraylist����д����getConnection
	 * ��ӷ���returnConnection���������д�ģ�����Ĭ���еģ�Υ����DIPԭ��
	 * ��ҪתΪ��̬��Ȼ��ͨ��װ��ģʽ���ã�װ��ģʽ����ʵ��Connection��close����������returnConnection��
	 * 
	 */
	// ��ʼ�����ӳ�
	public static final ArrayList<Connection> connList;
	static {
		connList = new ArrayList<>(10);
		// ��JDBC�����õ����Ӳ���ֵ
		for (int i = 0; i < 10; i++) {
			connList.add(JDBCUtils.getConnection());
		}
		System.out.println("���ӳ��ѳ�ʼ������ǰ����Ϊ��" + connList.size());
	}

	@Override
	public Connection getConnection() throws SQLException {
		// ��������������õ�һ��connection���ó������������ܱ�֤Ψһ�ԣ�����ͬʱ�����ã������л�����
		System.out.println("׼��ȡ�����ӳأ���ǰ����Ϊ��" + connList.size());
		Connection conn = connList.remove(0);
		System.out.println("��ȡ�����ӳ��е����ӣ���ǰ����Ϊ��" + connList.size());
		return conn;
	}

	/**
	 * �黹���������ӳ�
	 */
	public static void returnConnection(Connection conn) {
		System.out.println("׼���黹���ӳأ���ǰ����Ϊ��" + connList.size());
		connList.add(conn);
		System.out.println("�ѹ黹���ӳ��е����ӣ���ǰ����Ϊ��" + connList.size());
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
