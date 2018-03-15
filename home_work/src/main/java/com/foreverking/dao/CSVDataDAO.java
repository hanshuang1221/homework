package com.foreverking.dao;

import java.util.List;

import com.foreverking.model.CSVDataModel;

/**
 * CSV ����DAO
 * 
 * @author wy
 *
 */
public interface CSVDataDAO {

	/**
	 * ��������CSV����
	 * 
	 * @param list
	 *            List<CSVDataModel>
	 */
	public void batchInsert(List<CSVDataModel> list);

}
