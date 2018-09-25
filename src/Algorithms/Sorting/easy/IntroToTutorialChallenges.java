//Date 25-9-2018

package Algorithms.Sorting.easy;

import java.util.Scanner;

public class IntroToTutorialChallenges {

    static int introTutorial(int v, int[] arr) {

        int a =0;
        int b = arr.length-1;
        int current = (int)Math.ceil((a+b)/2.0);
        while(true)
        {
            if ( v == arr[current] )
                return current;
            else if( v > arr[current])
            {
                a=current;
                current = (int)Math.ceil((a+b)/2.0);;
            }
            else{
                b=current;
                current = (int)Math.ceil((a+b)/2.0);;
            }
        }

    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(introTutorial(V, arr));

        scanner.close();
    }
}
