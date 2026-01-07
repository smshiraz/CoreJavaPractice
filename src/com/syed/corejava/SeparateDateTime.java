package com.syed.corejava;

/*
===========================================================
 DATE & TIME IN JAVA – LEGACY vs MODERN APIs
===========================================================

LEGACY APIs (Avoid in new code):
- java.util.Date
- java.util.Calendar
- java.text.SimpleDateFormat
❌ Mutable
❌ Not thread-safe
❌ Poor design

MODERN APIs (java.time – Java 8+):
- LocalDate
- LocalTime
- LocalDateTime
- ZonedDateTime
- Instant
- DateTimeFormatter
✅ Immutable
✅ Thread-safe
✅ Clear & well-designed

===========================================================
*/

import java.time.*;
import java.time.format.DateTimeFormatter;

// -------- LEGACY IMPORTS (DO NOT USE IN NEW PROJECTS) --------
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class SeparateDateTime {

	public static void main(String[] args) {

		System.out.println("=== JAVA DATE & TIME : LEGACY vs MODERN ===\n");

		// =======================================================
		// MODERN API (java.time) – RECOMMENDED
		// =======================================================

		/*
		 * LocalDate (MODERN) - Date only (yyyy-MM-dd) - No time, no timezone -
		 * Immutable & thread-safe
		 */
		LocalDate currentDate = LocalDate.now();

		/*
		 * LocalTime (MODERN) - Time only (HH:mm:ss.nanos) - No date, no timezone -
		 * Immutable & thread-safe
		 */
		LocalTime currentTime = LocalTime.now();

		System.out.println("1. MODERN – LocalDate & LocalTime:");
		System.out.println("   Date: " + currentDate);
		System.out.println("   Time: " + currentTime);
		System.out.println();

		/*
		 * LocalDateTime (MODERN) - Date + Time - No timezone - Commonly used inside
		 * applications
		 */
		LocalDateTime localDateTime = LocalDateTime.now();

		/*
		 * Extracting date and time separately from LocalDateTime
		 */
		LocalDate extractedDate = localDateTime.toLocalDate();
		LocalTime extractedTime = localDateTime.toLocalTime();

		System.out.println("2. MODERN – LocalDateTime:");
		System.out.println("   Full: " + localDateTime);
		System.out.println("   Date: " + extractedDate);
		System.out.println("   Time: " + extractedTime);
		System.out.println();

		/*
		 * DateTimeFormatter (MODERN) - Thread-safe - Used with java.time classes
		 */
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

		System.out.println("3. MODERN – DateTimeFormatter:");
		System.out.println("   Formatted Date: " + currentDate.format(dateFormatter));
		System.out.println("   Formatted Time: " + currentTime.format(timeFormatter));
		System.out.println();

		/*
		 * ZonedDateTime (MODERN) - Date + Time + Timezone - Essential for global
		 * applications
		 */
		ZonedDateTime zonedDateTime = ZonedDateTime.now();

		System.out.println("4. MODERN – ZonedDateTime:");
		System.out.println("   Full: " + zonedDateTime);
		System.out.println("   Timezone: " + zonedDateTime.getZone());
		System.out.println();

		/*
		 * Instant (MODERN) - Represents a point on UTC timeline - Stores epoch
		 * seconds/nanos - Best for DB, logs, events
		 */
		Instant instant = Instant.now();

		System.out.println("5. MODERN – Instant:");
		System.out.println("   Instant (UTC): " + instant);
		System.out.println("   Epoch Seconds: " + instant.getEpochSecond());
		System.out.println("   Epoch Millis : " + instant.toEpochMilli());
		System.out.println();

		/*
		 * Converting Instant to LocalDateTime (human-readable)
		 */
		LocalDateTime instantToLocal = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

		System.out.println("   Instant → LocalDateTime: " + instantToLocal);
		System.out.println();

		// =======================================================
		// LEGACY API (java.util / java.text) – AVOID
		// =======================================================

		/*
		 * Date (LEGACY) - Represents date + time - Mutable & not thread-safe - Poor API
		 * design
		 */
		Date date = new Date();

		/*
		 * SimpleDateFormat (LEGACY) - Used to format Date - NOT thread-safe
		 */
		SimpleDateFormat legacyDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat legacyTimeFormat = new SimpleDateFormat("HH:mm:ss");

		System.out.println("6. LEGACY – Date & SimpleDateFormat:");
		System.out.println("   Date: " + legacyDateFormat.format(date));
		System.out.println("   Time: " + legacyTimeFormat.format(date));
		System.out.println();

		/*
		 * Calendar (LEGACY) - Mutable - Month is 0-based - Not thread-safe
		 */
		Calendar calendar = Calendar.getInstance();

		System.out.println("7. LEGACY – Calendar:");
		System.out.println("   Year : " + calendar.get(Calendar.YEAR));
		System.out.println("   Month: " + (calendar.get(Calendar.MONTH) + 1));
		System.out.println("   Day  : " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("   Hour : " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("   Min  : " + calendar.get(Calendar.MINUTE));
		System.out.println("   Sec  : " + calendar.get(Calendar.SECOND));

	}
}
