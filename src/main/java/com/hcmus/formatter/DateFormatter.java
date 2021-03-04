package com.hcmus.formatter;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

public class DateFormatter implements Formatter<Date> {

	@SuppressWarnings("deprecation")
	@Override
	public String print(Date date, Locale locale) {
		System.out.println("inside print method()");
		return date.getYear() + "-" + date.getMonth() + "-" + date.getDate() + "date";
		
	}

	@Override
	public Date parse(String text, Locale locale) throws ParseException {
		System.out.println("inside parse method()");
		String[] token = text.split("-");
		@SuppressWarnings("deprecation")
		Date date = new Date(Integer.parseInt(token[0]) - 1900, Integer.parseInt(token[1]) - 1, Integer.parseInt(token[2]));
		System.out.println(date);
		return date;
	}

}
