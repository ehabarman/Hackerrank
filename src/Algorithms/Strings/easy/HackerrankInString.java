//Date 25-9-2018

package Algorithms.Strings.easy;

import java.util.Scanner;

public class HackerrankInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        queries:
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            char[] find = "hackerrank".toCharArray();
            int findIndex = 0;

            for(char c : s.toCharArray())
            {
                if(find[findIndex] == c)
                    findIndex++;

                if(findIndex == find.length){
                    System.out.println("YES");
                    continue queries;
                }

            }
            System.out.println("NO");
        }
    }
}
