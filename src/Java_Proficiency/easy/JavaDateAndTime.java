//Date 8-7-2018

package Java_Proficiency.easy;

import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateAndTime {

    public static String getDay(String day, String month, String year) {
        LocalDate lc = LocalDate.of(Integer.parseInt(year),
        							Integer.parseInt(month), 
        							Integer.parseInt(day));
        return lc.getDayOfWeek().toString();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        in.close();
        System.out.println(getDay(day, month, year));
    }
}
