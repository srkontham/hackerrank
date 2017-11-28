package intro.currency;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		// Write your code here.
		NumberFormat nf = null;
		// US Currency Format
		nf = NumberFormat.getCurrencyInstance(Locale.US);
		String us = nf.format(payment);

		// IN Currency Format
		Locale locale = new Locale("en", "IN");
		DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getCurrencyInstance(locale);
		DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance(locale);
		// dfs.setCurrencySymbol("\u20B9");
		dfs.setCurrencySymbol("Rs.");
		decimalFormat.setDecimalFormatSymbols(dfs);
		String india = decimalFormat.format(payment);

		// CN Currency Format
		nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
		String china = nf.format(payment);

		// FR Currency Format
		nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String france = nf.format(payment);

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}
}
