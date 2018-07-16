package Algorithms.Implementation.easy;

import java.util.Scanner;

public class DesignerPDFViewer {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int i=0; i < n; i++){
            h[i] = in.nextInt();
        }
        String word = in.next();
        int width=0;
        int max=0;
        for(int i=0;i<word.length();i++)
            {
            int index = (int)(word.charAt(i)-'a');
            width++;
            if(max<h[index])
                max=h[index];
        }
       
        
        System.out.println(width*max);
        in.close();
    }
}
