package com.nguyenvukha.ultils;

public class NumberUtils {
	public static int tryParseInt(String value, int defaultVal) {
	    try {
	        return Integer.parseInt(value);
	    } catch (NumberFormatException e) {
	        return defaultVal;
	    }
	}
	
	public static boolean isEmpty(int num) {
		if(num == -1) 
			return true;
		return false;
	}
}
