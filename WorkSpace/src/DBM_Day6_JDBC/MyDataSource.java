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
	 * 实现连接池，定义连接池arraylist，重写方法getConnection
	 * 添加方法returnConnection，这个是新写的，不是默认有的，违反了DIP原则，
	 * 需要转为静态，然后通过装饰模式调用，装饰模式就是实现Connection的close方法（调用returnConnection）
	 * 
	 */
	// 初始化连接池
	public static final ArrayList<Connection> connList;
	static {
		connList = new ArrayList<>(10);
		// 从JDBC里面拿到连接并赋值
		for (int i = 0; i < 10; i++) {
			connList.add(JDBCUtils.getConnection());
		}
		System.out.println("连接池已初始化，当前数量为：" + connList.size());
	}

	@Override
	public Connection getConnection() throws SQLException {
		// 调用这个方法会拿到一个connection，拿出来，这样才能保证唯一性，不会同时别人拿，有拿有还即可
		System.out.println("准备取出连接池，当前数量为：" + connList.size());
		Connection conn = connList.remove(0);
		System.out.println("已取出连接池中的连接，当前数量为：" + connList.size());
		return conn;
	}

	/**
	 * 归还连接至连接池
	 */
	public static void returnConnection(Connection conn) {
		System.out.println("准备归还连接池，当前数量为：" + connList.size());
		connList.add(conn);
		System.out.println("已归还连接池中的连接，当前数量为：" + connList.size());
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
