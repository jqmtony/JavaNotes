package carServer.Test;

import java.sql.SQLException;
import java.text.ParseException;

import carServer.Manager.ServiceManager;

public class userLoginTest {
	public static void main(String[] args) throws ParseException {
		String string = "User#Login#admin123#admin123";
		ServiceManager sManager = new ServiceManager();
		try {
			sManager.getService(string);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
