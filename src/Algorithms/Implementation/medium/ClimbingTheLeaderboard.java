//Date 13-7-2018
package Algorithms.Implementation.medium;

import java.util.Scanner;


public class ClimbingTheLeaderboard {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int scores[] = new int [s.nextInt()];
        int rank = 2 ;
        int score;

        scores[0] = s.nextInt();

        for (int i = 1, j = 1; i < scores.length; ++i) {
            score = s.nextInt();
            if(score != scores[j - 1]){
                scores[j] = score;
                ++rank;
                ++j;

            }

        }


        int games = s.nextInt();
        while (games-- > 0){

            score = s.nextInt();
            for (; rank > 1 ; ){
                if (scores[rank - 2] > score){
                    break;
                }else {
                    --rank;
                }
            }
            System.out.println(rank);
        }

        s.close();
    }
}
