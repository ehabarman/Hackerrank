//Date 13-7-2018
package Algorithms.Implementation.easy;


import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DayOfTheProgrammer {

	public static String solve(int year) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		int daysToAdjust = 255;
		if (year == 1918) {
			daysToAdjust = daysToAdjust + 13;
		}
		else if (year < 1918) {
			if (year % 4 == 0 && year % 100 == 0) {
				daysToAdjust = daysToAdjust - 1;
			}
		}
		LocalDate date = LocalDate.of(year, 1, 1);
		LocalDate dayOfProgrammer = date.plusDays(daysToAdjust);
		return dayOfProgrammer.format(formatter);
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
 

        int year = scanner.nextInt();
        String result = solve(year);
        System.out.println(result);
        scanner.close();
    }
}
