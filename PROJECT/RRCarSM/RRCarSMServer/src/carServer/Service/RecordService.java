package carServer.Service;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import carServer.Entity.Record;

public interface RecordService {

	public ArrayList<Record> rentRecord(String carId, String userId) throws SQLException, ParseException;

	public ArrayList<Record> returnRecord(String carId, String userId) throws SQLException, ParseException;

	public ArrayList<Record> listRecord(String userId) throws SQLException;

	public ArrayList<Record> adminListRecord() throws SQLException;

}
