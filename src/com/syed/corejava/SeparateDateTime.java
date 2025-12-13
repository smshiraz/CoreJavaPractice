package com.syed.corejava;

/*


This program demonstrates 8 different ways to extract date and time separately:

1. **LocalDate and LocalTime** - Modern approach using separate classes
2. **Extracting from LocalDateTime** - Converting a combined object to separate date and time
3. **Calendar components** - Legacy approach extracting individual components
4. **SimpleDateFormat** - Legacy formatting for separate date and time strings
5. **Individual components** - Getting specific parts (year, month, day, hour, minute, etc.)
6. **Creating separate objects** - Building custom date and time objects
7. **Different formats** - Various formatting options for date and time
8. **ZonedDateTime extraction** - Working with timezone-aware date and time

*/
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class SeparateDateTime {
	public static void main(String[] args) {
		System.out.println("=== EXTRACTING DATE AND TIME SEPARATELY ===\n");

		// 1. Using java.time.LocalDate and LocalTime (Modern approach)
		System.out.println("1. Using LocalDate and LocalTime (Modern):");
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();

		System.out.println("   Date: " + currentDate);
		System.out.println("   Time: " + currentTime);
		System.out.println("   Date formatted: " + currentDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("   Time formatted: " + currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		System.out.println();

		// 2. Extracting from LocalDateTime
		System.out.println("2. Extracting from LocalDateTime:");
		LocalDateTime dateTime = LocalDateTime.now();

		LocalDate extractedDate = dateTime.toLocalDate();
		LocalTime extractedTime = dateTime.toLocalTime();

		System.out.println("   Full DateTime: " + dateTime);
		System.out.println("   Extracted Date: " + extractedDate);
		System.out.println("   Extracted Time: " + extractedTime);
		System.out.println();

		// 3. Using Calendar (Legacy approach)
		System.out.println("3. Using Calendar (Legacy):");
		Calendar calendar = Calendar.getInstance();

		// Extract date components
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; // Month is 0-based
		int day = calendar.get(Calendar.DAY_OF_MONTH);

		// Extract time components
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int millisecond = calendar.get(Calendar.MILLISECOND);

		System.out.println("   Date components:");
		System.out.println("     Year: " + year);
		System.out.println("     Month: " + month);
		System.out.println("     Day: " + day);
		System.out.println("     Formatted date: " + String.format("%02d/%02d/%04d", day, month, year));

		System.out.println("   Time components:");
		System.out.println("     Hour: " + hour);
		System.out.println("     Minute: " + minute);
		System.out.println("     Second: " + second);
		System.out.println("     Millisecond: " + millisecond);
		System.out.println("     Formatted time: " + String.format("%02d:%02d:%02d", hour, minute, second));
		System.out.println();

		// 4. Using java.util.Date with SimpleDateFormat
		System.out.println("4. Using Date with SimpleDateFormat (Legacy):");
		Date date = new Date();

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String dateString = dateFormat.format(date);
		String timeString = timeFormat.format(date);
		String dateTimeString = dateTimeFormat.format(date);

		System.out.println("   Date only: " + dateString);
		System.out.println("   Time only: " + timeString);
		System.out.println("   Date and Time: " + dateTimeString);
		System.out.println();

		// 5. Extracting individual components from LocalDateTime
		System.out.println("5. Individual components from LocalDateTime:");
		LocalDateTime now = LocalDateTime.now();

		System.out.println("   Date components:");
		System.out.println("     Year: " + now.getYear());
		System.out.println("     Month: " + now.getMonth() + " (" + now.getMonthValue() + ")");
		System.out.println("     Day: " + now.getDayOfMonth());
		System.out.println("     Day of week: " + now.getDayOfWeek());
		System.out.println("     Day of year: " + now.getDayOfYear());

		System.out.println("   Time components:");
		System.out.println("     Hour: " + now.getHour());
		System.out.println("     Minute: " + now.getMinute());
		System.out.println("     Second: " + now.getSecond());
		System.out.println("     Nanosecond: " + now.getNano());
		System.out.println();

		// 6. Creating separate date and time objects
		System.out.println("6. Creating separate objects:");

		// Create date from components
		LocalDate customDate = LocalDate.of(2024, 12, 25);
		LocalTime customTime = LocalTime.of(14, 30, 45);

		System.out.println("   Custom date: " + customDate);
		System.out.println("   Custom time: " + customTime);
		System.out.println("   Combined: " + LocalDateTime.of(customDate, customTime));
		System.out.println();

		// 7. Different date and time formats
		System.out.println("7. Different formats:");

		DateTimeFormatter[] dateFormatters = { DateTimeFormatter.ofPattern("dd/MM/yyyy"),
				DateTimeFormatter.ofPattern("MM/dd/yyyy"), DateTimeFormatter.ofPattern("yyyy-MM-dd"),
				DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy"), DateTimeFormatter.ofPattern("dd MMM yyyy") };

		DateTimeFormatter[] timeFormatters = { DateTimeFormatter.ofPattern("HH:mm:ss"),
				DateTimeFormatter.ofPattern("hh:mm:ss a"), DateTimeFormatter.ofPattern("HH:mm"),
				DateTimeFormatter.ofPattern("hh:mm a"), DateTimeFormatter.ofPattern("HH:mm:ss.SSS") };

		System.out.println("   Date formats:");
		for (DateTimeFormatter formatter : dateFormatters) {
			System.out.println("     " + currentDate.format(formatter));
		}

		System.out.println("   Time formats:");
		for (DateTimeFormatter formatter : timeFormatters) {
			System.out.println("     " + currentTime.format(formatter));
		}
		System.out.println();

		// 8. Extracting from ZonedDateTime
		System.out.println("8. Extracting from ZonedDateTime:");
		ZonedDateTime zonedDateTime = ZonedDateTime.now();

		LocalDate zonedDate = zonedDateTime.toLocalDate();
		LocalTime zonedTime = zonedDateTime.toLocalTime();
		ZoneId zone = zonedDateTime.getZone();

		System.out.println("   Date: " + zonedDate);
		System.out.println("   Time: " + zonedTime);
		System.out.println("   Timezone: " + zone);
		System.out.println("   Full with timezone: " + zonedDateTime);
	}
}