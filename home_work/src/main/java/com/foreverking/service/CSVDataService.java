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
	 * 批量插入CSV数据接口
	 * 
	 * @param userId
	 * @return
	 */
	void batchInsert(List<CSVDataModel> list);
}
