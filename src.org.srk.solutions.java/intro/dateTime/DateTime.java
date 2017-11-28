package intro.dateTime;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class DateTime {

	public static String getDay(String day, String month, String year) {
		/*
		 * Write your code here.
		 *//*
			 * Write your code here.
			 */
		int y = Integer.parseInt(year);
		int m = Integer.parseInt(month);
		int d = Integer.parseInt(day);

		Calendar cal = Calendar.getInstance();
		cal.set(y, m - 1, d);

		return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()).toUpperCase();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();

		System.out.println(getDay(day, month, year));
		in.close();
	}
}