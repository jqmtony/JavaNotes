package DBM.Day5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updateStatement {
	public static Boolean updStatement() throws SQLException {
		// ����
		Connection con=JDBCUtils.getConnection();
		// ����
		String sql = "insert into student values(?,?,?,?)";
		// ����ʲô����
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, "test2");
		preparedStatement.setString(2, "test");
		preparedStatement.setString(3, "test");
		preparedStatement.setString(4, "test");
		// ������
		int result = preparedStatement.executeUpdate();
		// ȷ��������
		return result != 0;
	}
	public static void main(String[] args) throws SQLException {
		updStatement();
	}
}
