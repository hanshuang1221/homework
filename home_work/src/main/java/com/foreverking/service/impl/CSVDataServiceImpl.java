
package com.foreverking.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.foreverking.dao.CSVDataDAO;
import com.foreverking.model.CSVDataModel;
import com.foreverking.service.CSVDataService;

/**
 * CSVDataServiceImpl
 * 
 * @author wy
 *
 */
@Service
public class CSVDataServiceImpl implements CSVDataService {

	@Autowired
	private CSVDataDAO userDao;

	/**
	 * 批量插入CSV数据方法
	 */
	public void batchInsert(List<CSVDataModel> list) {
		if (CollectionUtils.isEmpty(list)) {
			return;
		}
		userDao.batchInsert(list);
	}
}
