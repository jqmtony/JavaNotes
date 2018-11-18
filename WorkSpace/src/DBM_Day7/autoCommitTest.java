package DBM_Day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

public class autoCommitTest {
	public static void main(String[] args) {
		String url = "jdbc:mysql:///tc35?useSSL=true&serverTimezone=GMT%2B8&userUnicode=True";
		Savepoint savepoint = null;
		Connection connection = null;
		try {
			// �õ�����
			connection = DriverManager.getConnection(url, "root", "123456");
			// �ص�autoCommit
			connection.setAutoCommit(false);
			// ���˺�1�۳�100
			String sql1 = "update account111 set balance = balance + 100 where id=1";
			PreparedStatement preparedStatement1= connection.prepareStatement(sql1);
			preparedStatement1.executeUpdate();
			preparedStatement1.close();
			// ���û�ԭ�Ľڵ�
			 savepoint = connection.setSavepoint();
			// ���˺�2����100
			String sql2 = "update account set balance = balance - 100 where id=2";
			PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
			preparedStatement2.executeUpdate();
			preparedStatement2.close();
			// �ύ�޸�
			connection.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				connection.rollback(savepoint);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
