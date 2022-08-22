package com.aurionpro.model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimes {

	public static void main(String[] args) {
		System.out.println("------Date class----------");
		Date date = new Date();
		String printDate = date.toString();
		System.out.println(printDate);
		System.out.println("------Formatting DateTime-----");
		SimpleDateFormat object = new SimpleDateFormat("dd-MM-yyyy  hh:mm:ss z");
		object.format(date);
		String formattedDate = object.format(date);
		System.out.println(formattedDate);
		System.out.println("------Local Date Time---------");
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println("------Formatting DateTime-----");
		LocalDateTime localDateTime = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
		String format = dtf.format(localDateTime);
		System.out.println(format);

	}

}