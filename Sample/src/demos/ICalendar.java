/**
 * sample : a calendar demo
 */
package demos;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ICalendar {
	public static void work() {
		GregorianCalendar calendar = new GregorianCalendar();
		//TEST LINE:
		//calendar.set(Calendar.DAY_OF_YEAR, 32);
		int today= calendar.get(Calendar.DAY_OF_MONTH);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		String[] months = new java.text.DateFormatSymbols().getMonths();
		System.out.printf("%d,%s\n", year, months[month]);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		calendar.set(Calendar.DAY_OF_WEEK, 1);
		int indent = 0;
		while ( calendar.get(Calendar.DAY_OF_WEEK) != dayOfWeek) {
			indent++;
			calendar.add(Calendar.DAY_OF_WEEK, 1);
		}
		String[] shortWeekDays= new java.text.DateFormatSymbols().getShortWeekdays();
		for( String ele : shortWeekDays) System.out.printf("%4s", ele);
		System.out.println();
		for (int c=0 ; c< indent; c++) System.out.printf("    ");
		int dayOfMonth=0;
		while (calendar.get(Calendar.MONTH) == month) {
			dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
			if (calendar.get(Calendar.DAY_OF_WEEK) == calendar.getFirstDayOfWeek()) System.out.println();
			if (calendar.get(Calendar.DAY_OF_MONTH) != today)
				System.out.printf("%4d", dayOfMonth);
			else 
				System.out.printf("%3d*", dayOfMonth);
			calendar.add(Calendar.DAY_OF_YEAR, 1);
		}
		System.out.println();
	}

}
