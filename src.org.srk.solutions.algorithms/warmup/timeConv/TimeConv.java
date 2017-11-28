package warmup.timeConv;

import java.util.Scanner;

public class TimeConv {
	static String timeConversion(String s) {
		// Complete this function
		String[] time = s.split(":");
		String hours = time[0];
		String minutes = time[1];
		String seconds = time[2].substring(0, 2);
		String ampm = time[2].substring(2);
		String t24 = null;

		if (ampm.equals("AM"))
			t24 = (hours.equals("12") ? "00" : hours) + ":" + minutes + ":" + seconds;
		else
			t24 = (hours.equals("12") ? hours : (Integer.parseInt(hours) + 12)) + ":" + minutes + ":" + seconds;

		return t24;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = timeConversion(s);
		System.out.println(result);
		in.close();
	}
}
