//Date 14-7-2018
package Algorithms.Implementation.medium;

import java.util.Scanner;

public class TheGridSearch {

	public static void main(String[] args) {

	    Scanner s = new Scanner(System.in);
	    int steps = Integer.parseInt(s.nextLine());
	    while(steps >0){
	        int sr = s.nextInt();
	        int sc = s.nextInt();
	        boolean found = false;
	        s.nextLine();
	        int[][] m1 = new int[sr][sc];
	        for(int i=0;i<sr;i++){
	            String row = s.nextLine();
	            for(int j=0;j<sc;j++){
	                m1[i][j] = (int)(row.charAt(j) );
	            }

	        }

	        int fr = s.nextInt();
	        int fc = s.nextInt();

	        s.nextLine();
	        int[][] m2 = new int[fr][fc];

	        for(int i=0;i<fr;i++){
	            String row = s.nextLine();

	            for(int j=0;j<fc;j++){
	                m2[i][j] = (int)(row.charAt(j) );
	            }

	        }

	        outLoop:
	        for(int i=0;i<sr;i++){
	            for(int j=0;j<sc;j++){
	                if(m1[i][j]==m2[0][0]){
	                   if(isMatrix(m1,m2,fr,fc,i,j) ){
	                       found = true; 
	                       break outLoop;
	                   } else{
	                       found = false;
	                   }
	                }
	            }
	        }

	       String r = (found==true)?"YES":"NO"; 
	       System.out.println(r);

	        steps--;
	    }
	    s.close();
	}
	public static boolean isMatrix(int[][] m1, int[][] m2, int fr, int fc, int i, int j){

	    for(int a=0;a<fr;a++){
	        for(int b=0;b<fc;b++){
	            try{
	                if(m2[a][b]!=m1[i+a][j+b]){                       
	                    return false;
	                }
	            }
	            catch(Exception e){
	               return false;
	            }

	        }
	    }
	     return true;
	}
}
