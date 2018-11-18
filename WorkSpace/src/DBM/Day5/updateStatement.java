package DBM.Day5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updateStatement {
	public static Boolean updStatement() throws SQLException {
		// 有桥
		Connection con=JDBCUtils.getConnection();
		// 有人
		String sql = "insert into student values(?,?,?,?)";
		// 人是什么样的
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, "test2");
		preparedStatement.setString(2, "test");
		preparedStatement.setString(3, "test");
		preparedStatement.setString(4, "test");
		// 人上桥
		int result = preparedStatement.executeUpdate();
		// 确定上桥了
		return result != 0;
	}
	public static void main(String[] args) throws SQLException {
		updStatement();
	}
}
