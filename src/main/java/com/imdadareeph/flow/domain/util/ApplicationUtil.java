package com.imdadareeph.flow.domain.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ApplicationUtil {

	private static final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

	public static String toString(LocalDateTime localDateTime) {
		return DateTimeFormatter.ofPattern(DATE_TIME_PATTERN,
			Locale.ROOT).format(localDateTime);
	}

	public static String getCurrTime() {
		return toString(LocalDateTime.now());
	}

}
