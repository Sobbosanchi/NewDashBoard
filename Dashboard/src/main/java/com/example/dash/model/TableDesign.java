package com.example.dash.model;

import org.springframework.data.annotation.Id;

public class TableDesign {

	@Id
	private String column;
	
	private String columnName;
	public String getColumn() {
		return column;
	}
	public void setColumn(String column) {
		this.column = column;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	
	
}
