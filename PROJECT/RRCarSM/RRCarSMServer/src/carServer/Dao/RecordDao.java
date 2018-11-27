package carServer.Dao;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import carServer.Entity.Record;

public interface RecordDao {

	public ArrayList<Record> getRentRecord(String carId, String userId) throws SQLException, ParseException;

	public ArrayList<Record> getReturnRecord(String carId, String userId) throws SQLException, ParseException;

	public ArrayList<Record> listUserRecord(String userId) throws SQLException;

	public ArrayList<Record> listRecord() throws SQLException;

}
