//Date 19-9-2018

package Mathematics.Fundamentals.easy;

import java.util.Scanner;

public class StrangeGridAgain {

    /*
     * Complete the strangeGrid function below.
     */
    static long strangeGrid(int r, int c) {
        long currentRow = (r-1)/2;
        currentRow*=10;

        if (r % 2 == 0)
            return currentRow+ 1 + (c-1)*2;
        else
            return currentRow+ (c-1)*2;

    }

    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        int r = s.nextInt();

        int c = s.nextInt();

        long result = strangeGrid(r, c);

        System.out.println(result);

        s.close();
    }
}
