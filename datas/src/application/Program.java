package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
	
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T18:39:39");
		Instant d06 = Instant.parse("2022-07-20T18:39:39Z");
		Instant d07 = Instant.parse("2022-07-20T18:39:39-03:00");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		System.out.println("pastWeekLocalDate " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate " + nextWeekLocalDate);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		System.out.println(pastWeekInstant);
		
		
		LocalDate d08 = LocalDate.parse("20/07/2008", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2008 08:06", fmt2);
		
		LocalDate d10 = LocalDate.of(2022, 07, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		
		System.out.println("---------------");
		
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("d04 = " + d04.format(fmt4));
		
		DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println("d05 = " + d05.format(fmt4));
		System.out.println("d05 = " + d05.format(fmt5));
		
		DateTimeFormatter fmt6 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		System.out.println("d06 = " + fmt6.format(d06));
		
		
	}

}
