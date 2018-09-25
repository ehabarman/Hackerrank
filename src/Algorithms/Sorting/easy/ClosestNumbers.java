package Algorithms.Sorting.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumbers {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++)
            arr[i] = s.nextInt();

        Arrays.sort(arr);
        int min = arr[1]-arr[0];
        ArrayList<Integer> pairs = new ArrayList<Integer>();
        pairs.add(arr[0]);
        pairs.add(arr[1]);

        for(int i = 2 ; i < n ;i++)
        {
            int newMin = arr[i]-arr[i-1];

            if(newMin==min){
                pairs.add(arr[i-1]);
                pairs.add(arr[i]);
            }
            else if (newMin < min){
                min=newMin;
                pairs = new ArrayList<Integer>();
                pairs.add(arr[i-1]);
                pairs.add(arr[i]);
            }
        }

        for(int i =0;i<pairs.size();i++){
            System.out.print(pairs.get(i)+" ");
        }

    }

}
