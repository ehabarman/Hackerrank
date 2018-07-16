//Date 10-7-2018
package Java_Proficiency.easy;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        
        System.out.println("US: " + NumberFormat.getCurrencyInstance(new Locale("en","US")).format(payment));
		System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment));
		System.out.println("China: " + NumberFormat.getCurrencyInstance(new Locale("zh","CN")).format(payment));
		System.out.println("France: " + NumberFormat.getCurrencyInstance(new Locale("fr","FR")).format(payment));
    }
}
