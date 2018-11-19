package com.server.service;

import java.util.ArrayList;
import java.util.List;

import com.server.bean.Record;
import com.server.bean.User;

public interface RecordService {
	/**
	 * ������е��⳵��¼����������ʱ�䣬����ֵΪ�ö�����б�
	 * @return
	 */
	ArrayList<Record> listRecord();
	/**
	 * ���ظ��û��ı��λ�����¼
	 * @param record
	 * @return ����Ϊnull,��������ʧ��
	 */
	Record rentCar(Record record);
	/**
	 * ��õ�ǰ�û��������⳵��¼
	 * @param user
	 * @return
	 */
	List<Record> listRecord2(User user);
	/**
	 * ���ظ��û��ı����⳵��¼
	 * @param record
	 * @return����Ϊnull,��������ʧ��
	 */
	Record returnCar(Record record);

}