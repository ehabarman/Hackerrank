//Date 14-7-2018
package Algorithms.Implementation.medium;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        double col=Math.ceil(Math.pow(s.length(),0.5));
        String ans ="";
        for(int i=0;i<col;i++){
        	int j=0;
        	while(i+j<s.length()){
        		ans=ans+s.substring(i+j,i+j+1);
            	j=(int) (j+col);}
        	ans=ans+" ";}
        System.out.println(ans);
        in.close();
    }
}