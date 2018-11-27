package com.client.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.client.bean.Record;
import com.client.bean.User;
import com.client.service.RecordService;
import com.client.util.ClientSocket;
import com.client.util.JSONUtils;

public class RecordServiceImpl implements RecordService {

	@Override
	public ArrayList<Record> listRecord() {
		String str = "RecordService#" + "listRecord";
		try {
			String response = ClientSocket.getResponse(str);
			ArrayList<Record> responses = (ArrayList<Record>) JSONUtils.JSONStringToList(response, Record.class);
			return responses;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Record rentCar(Record record) {
		String str = "RecordService#" + "rentCar#" + JSONUtils.objectToJSONString(record);
		try {
			String response = ClientSocket.getResponse(str);
			Record responses = (Record) JSONUtils.JSONStringToList(response, Record.class);
			return responses;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Record> listRecord2(User user) {
		String str = "RecordService#" + "listRecord";
		try {
			String response = ClientSocket.getResponse(str);
			ArrayList<Record> responses = (ArrayList<Record>) JSONUtils.JSONStringToList(response, Record.class);
			return responses;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Record returnCar(Record record) {
		String str = "RecordService#" + "returnCar#" + JSONUtils.objectToJSONString(record);
		try {
			String response = ClientSocket.getResponse(str);
			Record responses = (Record) JSONUtils.JSONStringToList(response, Record.class);
			return responses;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
