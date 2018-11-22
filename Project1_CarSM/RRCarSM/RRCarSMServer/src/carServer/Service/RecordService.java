package carServer.Service;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import carServer.Entity.Record;

public interface RecordService {

	public ArrayList<Record> rentCar(String carId, String userId) throws SQLException, ParseException;

	public ArrayList<Record> returnCar(String carId, String userId) throws SQLException, ParseException;

}
