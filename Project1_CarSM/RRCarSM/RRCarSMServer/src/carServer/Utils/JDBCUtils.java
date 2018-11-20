package carServer.Utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;


/**
 * 
 * ' ����һ��������ӵ�л�ȡ���ݿ������,���ṩ�����Դ�Ĺرշ���
 * 
 * @author Administrator
 *
 */
public class JDBCUtils {
	// Alt + /���Խ�������
	private static Properties sProperties;
	// -- �ṩ�ĸ��������ڽ��������ļ��е�����
	private static String driver;
	private static String url;
	private static String user;
	private static String pwd;
	/**
	 * ' ͨ����̬���ȡ�����ļ�
	 */
	static {
		// -- 1.ʵ����Properties����
		sProperties = new Properties();
		// -- 2.��Properties������������ļ�.ͨ���ṩָ�������ļ���������
		InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("config.properties");
		try {
			sProperties.load(is);
			// -- 3.��ȡ�����ļ�
			driver = sProperties.getProperty("driverClassName");
			url = sProperties.getProperty("url");
			user = sProperties.getProperty("username");
			pwd = sProperties.getProperty("password");
		} catch (IOException e) {
			System.out.println("��ȡ�����ļ�ʧ��!");
		}
	}

	/**
	 * ' һ������³�Ա��������Сдm��ͷ ' ��̬��������Сдs��ͷ
	 */
	private static Connection mConnection;

	/**
	 * '���ڻ�ȡ���ݿ����Ӷ���
	 * 
	 * @return ��������ȡ�����ݿ����Ӷ���
	 */
	public static Connection getConnection() {
		// -- �ж������Ƿ��Ѿ���,����Ѿ�����ֱ�ӷ�������,���������
		if (mConnection == null) {
			try {
				// -- 1.��������
				Class.forName(driver);
				// -- 2.ͨ��DriverManager����ȡ����
				mConnection = DriverManager.getConnection(url, user, pwd);
			} catch (ClassNotFoundException e) {
				System.out.println("�����ļ�������!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return mConnection;
	}

	/**
	 * ' �ر�����
	 *
	 */
	public void closeConnection(Connection conn) {
		try {
			// -- Alt + Shift + Z �Դ������try-catch
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("�ر�����ʧ��");
			return;
		}

		System.out.println("�ر����ӳɹ�!~");

	}

	public static void main(String[] args) {
		JDBCUtils u = new JDBCUtils();
		Connection conn = JDBCUtils.getConnection();
		if (conn != null) {
			u.closeConnection(conn);
		}
	}

	public static void closeResultSet(ResultSet rSet) throws SQLException {
		if(rSet!=null&&!rSet.isClosed()) {
			rSet.close();
		}
		
	}

	public static void closePreparedStatement(PreparedStatement preparedStatement) throws SQLException {
		if(preparedStatement!=null && !preparedStatement.isClosed()) {
			preparedStatement.close();
		}
		
	}
}