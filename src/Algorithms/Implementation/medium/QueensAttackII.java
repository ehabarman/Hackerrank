//Date 14-7-2018
package Algorithms.Implementation.medium;

import java.util.Scanner;

public class QueensAttackII {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int rQueen = in.nextInt();
        int cQueen = in.nextInt();
        
        int up,left,right,down,uld,urd,dld,drd;
        up = n-rQueen;
        down = rQueen-1;
        left = cQueen-1;
        right = n-cQueen;
        uld=up<left?up:left; 
        urd=up<right?up:right; 
        dld=down<left?down:left;
        drd=down<right?down:right;
        
        for(int a0 = 0; a0 < k; a0++){
            int rObstacle = in.nextInt();
            int cObstacle = in.nextInt();

            if(cObstacle==cQueen){
            
                int path = Math.abs(rObstacle-rQueen)-1;
                if(rQueen<rObstacle){

                    up=up<path?up:path;
                }else{
                    down=down<path?down:path;
                }
            }else if(rObstacle==rQueen){

                int path = Math.abs(cObstacle-cQueen)-1;
                if(cQueen<cObstacle){
                    right = right<path?right:path;
                }else{
                    left=left<path?left:path;
                }
            }else{
                int path = Math.abs(cObstacle-cQueen)-1;
                int path2= Math.abs(rObstacle-rQueen)-1;
                
                if(path==path2){
                if(cQueen<cObstacle && rQueen<rObstacle){
                    
    
                    urd=urd<path?urd:path;
                }else if(cQueen>cObstacle && rQueen<rObstacle){

                    uld=uld<path?uld:path;
                }else if(cQueen<cObstacle && rQueen>rObstacle){

                    drd=drd<path?drd:path;
                }else{
                    dld=dld<path?dld:path;
                }
                }
            }
        }
              
        int total = up+down+left+right+urd+uld+drd+dld;
        System.out.println(total);
        in.close();
    }
}
