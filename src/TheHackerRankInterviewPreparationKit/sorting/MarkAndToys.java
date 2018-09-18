//Date 18-9-2018

package TheHackerRankInterviewPreparationKit.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MarkAndToys {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int [] arr = new int [n];

        for(int i = 0;i<n;i++)
            arr[i]=s.nextInt();

        Arrays.sort(arr);

        int count=0;

        for(int i =0; i < n && m>=0; i++)
        {
            count++;
            m-=arr[i];
        }

        System.out.println(count-1);

        s.close();
    }
}
