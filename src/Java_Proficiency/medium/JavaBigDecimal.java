//Date 9-7-2018
package Java_Proficiency.medium;

import java.math.BigDecimal;
import java.util.Scanner;

public class JavaBigDecimal {

	public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
      //Write your code here
        for (int i = 0; i < n-1; i++) {
        	int indexMax=i;
            for (int k = i+1; k < n; k++) {
                if (new BigDecimal(s[indexMax]).compareTo(new BigDecimal(s[k])) < 0) {
                	indexMax=k;
                }
            }
            String tempValue = s[indexMax];
            s[indexMax] = s[i];
            s[i] = tempValue;
            
        }
      //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
