package ManagerSystem.Dao;

import java.sql.SQLException;

import ManagerSystem.Domain.User;

public interface UserDao {

	User getUser(String... params) throws SQLException;


}
