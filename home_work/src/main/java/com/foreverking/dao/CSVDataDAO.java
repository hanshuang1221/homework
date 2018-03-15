package com.foreverking.dao;

import java.util.List;

import com.foreverking.model.CSVDataModel;

/**
 * CSV 数据DAO
 * 
 * @author wy
 *
 */
public interface CSVDataDAO {

	/**
	 * 批量插入CSV数据
	 * 
	 * @param list
	 *            List<CSVDataModel>
	 */
	public void batchInsert(List<CSVDataModel> list);

}
