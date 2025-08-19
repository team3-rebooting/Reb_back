package com.sol.app.dto;

public class FiledDTO {
	private int fieldNumber;
	private String fieldName;
	
	public int getFieldNumber() {
		return fieldNumber;
	}
	public void setFieldNumber(int fieldNumber) {
		this.fieldNumber = fieldNumber;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	
	@Override
	public String toString() {
		return "FiledDTO [fieldNumber=" + fieldNumber + ", fieldName=" + fieldName + "]";
	}	
}
