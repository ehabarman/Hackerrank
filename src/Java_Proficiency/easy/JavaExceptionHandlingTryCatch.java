//Date 10-7-2018
package Java_Proficiency.easy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {

	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        try{
	            int a = s.nextInt();
	            int b = s.nextInt();
	            System.out.println(a/b);
	        }
	        catch(InputMismatchException ex1)
	        {
	            System.out.println("java.util.InputMismatchException");
	        }
	        catch(Exception ex2){
	            System.out.println(ex2.toString());
	        }
	        finally{
	           s.close(); 
	        }
	        
	    }
}
