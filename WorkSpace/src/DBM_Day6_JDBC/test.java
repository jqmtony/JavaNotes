package DBM_Day6_JDBC;

import java.sql.Connection;
import java.sql.SQLException;

public class test {
	public static void main(String[] args) {
		// 拿到连接
		MyDataSource ds= new MyDataSource();
		try {
			Connection con=ds.getConnection();
			// 归还连接
			MyConnection returnConn = new MyConnection(con);
			returnConn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
