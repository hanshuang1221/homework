package com.foreverking.controller;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foreverking.model.CSVDataModel;
import com.foreverking.service.CSVDataService;
import com.opencsv.CSVReader;

/**
 * CSV文件解析
 * 
 * @author wy
 *
 */
@Service
public class PassFileController implements IController {

	private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

	@Autowired
	private CSVDataService service;

	/**
	 * csv文件解析
	 * 
	 * @param fileName
	 *            文件名称
	 */
	public String tranceCSVFile(String fileName) {
		File file = new File(fileName);
		try {

			String name = file.getName();
			if (name.endsWith(".csv") || name.endsWith(".CSV")) {
				name = name.substring(0, name.length() - 4);
			} else {
				return "NOT_SUOOPRT";
			}
			Date date = format.parse(name);

			FileReader fReader = new FileReader(file);
			CSVReader csvReader = new CSVReader(fReader);
			// 第一行表头数据，不做处理
			csvReader.readNext();
			service.batchInsert(tranceDataToPO(date, csvReader));
			csvReader.close();
		} catch (IOException e) {
			return "NOT_FOUND_FILE";
		} catch (ParseException e) {
			return "FILE_NAME_ERROR";
		}
		return "SUCCESS";
	}

	private List<CSVDataModel> tranceDataToPO(Date date, CSVReader csvReader) throws IOException {
		List<CSVDataModel> result = new ArrayList<CSVDataModel>();
		// 讀取內容
		List<String[]> list = csvReader.readAll();

		for (String[] ss : list) {
			if (ss != null && ss.length > 1) {
				String stockCode = ss[0];
				for (int i = 1; i < ss.length; i++) {
					String value = ss[i];
					if (!StringUtils.isEmpty(value)) {
						double dValue = Double.parseDouble(value);
						String itemId = UUID.randomUUID().toString();
						CSVDataModel model = new CSVDataModel();
						model.setItemId(itemId);
						model.setStockCode(stockCode);
						model.setTradingDate(date);
						model.setItemValue(dValue);
						result.add(model);
					}
				}
			}
		}
		return result;
	}
}
