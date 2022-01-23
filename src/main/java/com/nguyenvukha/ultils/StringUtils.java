package com.nguyenvukha.ultils;

public class StringUtils {
	public static boolean isNullOrEmpty(String str) {
		if(str == null || str == "")
			return true;
		return false;
	}
}
