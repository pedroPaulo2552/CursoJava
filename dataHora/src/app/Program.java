package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		
		LocalDateTime d02 = LocalDateTime.now();
		
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2025-08-30");
		
		LocalDateTime d05 = LocalDateTime.parse("2025-08-30T06:30:26");
		
		Instant d06 = Instant.parse("2025-08-30T06:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 09:40", fmt2);
		
		LocalDate d10 = LocalDate.of(2025, 9, 03);
		
		LocalDateTime d11 = LocalDateTime.of(2025, 9, 03, 10, 00);
		System.out.println(d11);
	}

}
