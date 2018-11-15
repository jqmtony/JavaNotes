package com.hwua.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *  '结果集持有者.负责把结果集里面的数据封装到集合中.
 * @author Administrator
 *
 * @param <T>
 */
public interface ResultSetHandler<T> {

	public List<T> handler(ResultSet rSet) throws SQLException;
}
