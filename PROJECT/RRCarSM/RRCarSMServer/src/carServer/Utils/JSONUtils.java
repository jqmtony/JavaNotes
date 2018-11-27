package carServer.Utils;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JSONUtils {

	private JSONUtils() {
	}

	private static JSONUtils instance;

	public static JSONUtils getInstance() {
		if (instance == null) {
			instance = new JSONUtils();
		}
		return instance;
	}

	/**
	 * `把列表转换成json字符串
	 * 
	 * @param t
	 * @return
	 */
	public static <T> String listToJSONString(List<T> list) {
		JSONArray array = JSONArray.parseArray(JSON.toJSONString(list));
		return array.toJSONString();
	}

	/**
	 * `把对象转换成json字符串：user.... >>> string, string userinfro =
	 * objectToJsonString(user);
	 * 
	 * @param t
	 * @return
	 */
	public static <T> String objectToJSONString(T t) {
		return JSON.toJSONString(t);
	}

	/**
	 * `把字符串转换成相应类型的列表
	 * 
	 * @param str
	 * @param clazz
	 * @return
	 */
	public static <T> List<T> JSONStringToList(String response, Class<T> clazz) {
		JSONArray json = JSONArray.parseArray(response);
		return (List<T>) JSONArray.parseArray(json.toJSONString(), clazz);
	}

	/**
	 * `把json字符串转换成对象, user user = jsonstringtoojbe(string, user.class);
	 * 
	 * @param str
	 * @param clazz
	 * @return
	 */
	public static <T> T JSONStringToObject(String response, Class<T> clazz) {
		return JSON.parseObject(response, clazz);
	}

	/**
	 * rSet转String
	 * 
	 * @param resultSet
	 * @return
	 * @throws SQLException
	 */
	public static String resultSetToJSONString(ResultSet resultSet) throws SQLException {
		// json数组
		JSONArray array = new JSONArray();
		// 获取列数
		ResultSetMetaData metaData = resultSet.getMetaData();
		int columnCount = metaData.getColumnCount();
		// 遍历ResultSet中的每条数据
		while (resultSet.next()) {
			JSONObject jsonObj = new JSONObject();

			// 遍历每一列
			for (int i = 1; i <= columnCount; i++) {
				String columnName = metaData.getColumnLabel(i);
				String value = resultSet.getString(columnName);
				jsonObj.put(columnName, value);
			}
			array.add(jsonObj);
		}

		return array.toString();
	}

}
