//Date 8-7-2018
package Java_Proficiency.easy;

import java.util.Scanner;

public class JavaLoopI {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        for(int i =1;i<=10;i++)
            System.out.println(N+" x "+i+" = "+N*i);

        scanner.close();
    }
}
