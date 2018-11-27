package carServer.Test;

import java.sql.SQLException;
import java.text.ParseException;

import carServer.Entity.User;
import carServer.Manager.ServiceManager;
import carServer.Utils.JSONUtils;

public class userRegisterTest {
	public static void main(String[] args) throws ParseException {
		ServiceManager sManager = new ServiceManager();
		User user = new User(0, "testRegister", "testRegister", "female", "123", "123456", "…œ∫£", 1);
		String userRequest = JSONUtils.objectToJSONString(user);
		String string = "User#Register#"+userRequest;
		try {
			sManager.getService(string);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
