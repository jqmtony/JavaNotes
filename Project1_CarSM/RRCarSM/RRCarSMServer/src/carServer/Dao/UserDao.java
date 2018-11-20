package carServer.Dao;

import java.sql.SQLException;
import java.util.List;

import carServer.Entity.User;


public interface UserDao {

	User getUser(String... params) throws SQLException;

	Boolean addUser(User user) throws SQLException;


}
