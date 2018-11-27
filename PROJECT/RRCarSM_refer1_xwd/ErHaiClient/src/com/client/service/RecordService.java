package com.client.service;

import java.util.ArrayList;
import java.util.List;

import com.client.bean.Record;
import com.client.bean.User;

public interface RecordService {
	/**
	 * 获得所有的租车记录，包括还车时间，返回值为该对象的列表
	 * @return
	 */
	ArrayList<Record> listRecord();
	/**
	 * 返回该用户的本次还车记录
	 * @param record
	 * @return 返回为null,代表还车失败
	 */
	Record rentCar(Record record);
	/**
	 * 获得当前用户的所有租车记录
	 * @param user
	 * @return
	 */
	List<Record> listRecord2(User user);
	/**
	 * 返回该用户的本次租车记录
	 * @param record
	 * @return返回为null,代表还车失败
	 */
	Record returnCar(Record record);

}
