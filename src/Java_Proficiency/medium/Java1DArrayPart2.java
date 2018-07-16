//Date 9-8-2018

package Java_Proficiency.medium;

import java.util.Scanner;

public class Java1DArrayPart2 {

	public static int[] game;
	public static int n;
	public static int leap;
	public static boolean canWin(int index) {
        
		game[index]=1;
		boolean resultForward=false;
		boolean resultLeap=false;
		boolean resultBackWord=false;
		if(index+1 >=n || index+leap>=n)
			return true;
		
		if(game[index+1]==0)
			resultForward= canWin(index+1);
		
		if(resultForward)
			return true;
		
		if(game[index+leap]==0)
			resultLeap= canWin(index+leap);
		
		if(resultLeap)
			return true;
		
		
		if(index-1>0 && game[index-1]==0)
			resultBackWord= canWin(index-1);
		
		if(resultBackWord)
			return true;
		
		
		
		
		return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            n = scan.nextInt();
            leap = scan.nextInt();
            
            game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(0)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
