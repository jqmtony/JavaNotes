package com.hwua.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *  '�����������.����ѽ������������ݷ�װ��������.
 * @author Administrator
 *
 * @param <T>
 */
public interface ResultSetHandler<T> {

	public List<T> handler(ResultSet rSet) throws SQLException;
}
