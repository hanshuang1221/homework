package com.foreverking.service;

import java.util.List;

import com.foreverking.model.CSVDataModel;;

/**
 * CSVDataService
 * 
 * @author wy
 *
 */
public interface CSVDataService {

	/**
	 * ��������CSV���ݽӿ�
	 * 
	 * @param userId
	 * @return
	 */
	void batchInsert(List<CSVDataModel> list);
}
