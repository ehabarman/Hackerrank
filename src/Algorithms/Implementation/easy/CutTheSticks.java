//Date 13-7-2018
package Algorithms.Implementation.easy;

import java.util.Arrays;
import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n;i++){
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        int min = arr[0];
        for(int i =0; i<n;){
            System.out.println(arr.length-i);
            i++;
            while(arr[i]==min){
                i++;
            }
            min = arr[i];
        }
        s.close();
        
    }
}
