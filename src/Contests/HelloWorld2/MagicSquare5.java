//Date 17-7-2018
package Contests.HelloWorld2;
import java.util.Scanner;

public class MagicSquare5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          int t = input.nextInt();
          for (int i=0;i<t;i++) {
              int n = input.nextInt();
              int [][] magicSquare = new int[n][n];
              
              for (int j=0;j<n;j++) {
              	for (int k=0;k<n;k++) {
                      magicSquare[j][k] = input.nextInt();
              	}
              }
              int sum = 0;
              int [] columnSum = new int[n];
              int [] rowSum = new int[n];
              int [] diagonalSum = new int[2];
              for (int j=0;j<n;j++) {
                  for (int k=0;k<n;k++) {
                    rowSum[j]+= magicSquare[j][k];
                     
                  }
              }
              
              
               for (int j=0;j<n;j++) {
                  for (int k=0;k<n;k++) {
                    columnSum[j]+= magicSquare[k][j];
                     
                  }
              }
              
              for (int j=0;j<n;j++) {
                  diagonalSum[0]+= magicSquare[j][j];
                  diagonalSum[1]+= magicSquare[j][n-j-1];
              }
              
              int rowIndex1 = -1, rowIndex2 = -1, columnIndex1 = -1, columnIndex2 = -1;
              
             boolean zero = false;
              for (int j=0;j<n;j++) {
              	if (zero)
              		break;
              	for (int k=0;k<n;k++) {
              		if (magicSquare[j][k] == 0) {
              			if (rowIndex1 == -1) {
              				rowIndex1 = j;
              				columnIndex1 = k;
              			}else if (rowIndex2 == -1) {
              				rowIndex2 = j;
              				columnIndex2 = k;
              				zero = true;
              				break;
              			}
              		}
              	}
              }
              
       
              
              int max = 0;
           for (int j=0;j<n;j++) {
          		 if (max < rowSum[j])
          			 	max = rowSum[j];
           }
           
           
           for (int j=0;j<n;j++) {
      		 if (max < columnSum[j])
      			 	max = columnSum[j];
       }
              sum = max;
              
              
           if (rowIndex1 != rowIndex2) {
               int[] result = new int[2];
               result[0] = sum - rowSum[rowIndex1];
               result[1] = sum - rowSum[rowIndex2];
               if (result[0] < result[1])
               System.out.println(result[0] + " " + result[1]);
               else 
                  System.out.println(result[1] + " " + result[0]); 
           }
           else{
               int[] result = new int[2];
               result[0] = sum - columnSum[columnIndex1];
               result[1] = sum - columnSum[columnIndex2];
                 if (result[0] < result[1])
               System.out.println(result[0] + " " + result[1]);
               else 
                  System.out.println(result[1] + " " + result[0]); 
           }  
           
          }
          input.close();
      }
}
