package chapter11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		// 옛날 방식
		Date date = new Date();
		
		System.out.println(date);
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		String date2 = format.format(date);
		System.out.println(date2);
		
		// 최근 방식
		System.out.println(LocalDate.now());
		String date3 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh:mm:ss"));
		System.out.println(date3);
	}
}