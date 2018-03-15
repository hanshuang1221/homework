package com.foreverking.model;

import java.util.Date;

/**
 * CSV 文件数据模型
 * @author wy
 *
 */
public class CSVDataModel {
	
	private String itemId;
	
	private Date tradingDate;
	
	private String stockCode;
	
	private double itemValue;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Date getTradingDate() {
		return tradingDate;
	}

	public void setTradingDate(Date tradingDate) {
		this.tradingDate = tradingDate;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public double getItemValue() {
		return itemValue;
	}

	public void setItemValue(double itemValue) {
		this.itemValue = itemValue;
	}
}
