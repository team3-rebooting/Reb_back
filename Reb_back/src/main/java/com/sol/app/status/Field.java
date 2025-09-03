package com.sol.app.status;

import com.sol.app.admin.Days;

public enum Field {
	IT(1, "IT"), DESIGN(2,"디자인"), LANG(3, "어학"), MUSIC(4, "음악"), COOK(5, "요리");
	
	private final int fieldNumber;
	private final String fieldName;
	
	public int getFieldNumber() {
		return fieldNumber;
	}
	public String getFieldName() {
		return fieldName;
	}
	
	Field(int fieldNumber, String fieldName) {
		this.fieldNumber = fieldNumber;
		this.fieldName = fieldName;
	}
	
	public static String findFieldName(int fieldNumber) {
		for (Field f : Field.values()) {
			if (f.getFieldNumber() == fieldNumber) {
				return f.getFieldName();
			}
		}
		
		return null;
	}
}
