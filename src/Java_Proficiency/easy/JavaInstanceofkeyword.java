//Date 10-7-2018
package Java_Proficiency.easy;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaInstanceofkeyword {

	static String count(ArrayList<Object> mylist){
	      int a = 0,b = 0,c = 0;
	      for(int i = 0; i < mylist.size(); i++){
	         Object element=mylist.get(i);
	         if(element instanceof Students)
	            a++;
	         if(element instanceof Rockstars)
	            b++;
	         if(element instanceof Hackers)
	            c++;
	      }
	      String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
	      return ret;
	   }

	public static void main(String []args){
	      ArrayList<Object> mylist = new ArrayList<>();
	      Scanner sc = new Scanner(System.in);
	      int t = sc.nextInt();
	      for(int i=0; i<t; i++){
	         String s=sc.next();
	         if(s.equals("Student"))mylist.add(new Students());
	         if(s.equals("Rockstar"))mylist.add(new Rockstars());
	         if(s.equals("Hacker"))mylist.add(new Hackers());
	      }
	      sc.close();
	      System.out.println(count(mylist));
	   }
}

class Students{}
class Rockstars{}
class Hackers{}
