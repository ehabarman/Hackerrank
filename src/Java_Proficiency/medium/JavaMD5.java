//Date 9-7-2018
package Java_Proficiency.medium;

import java.security.MessageDigest;
import java.util.*;

public class JavaMD5 {

	public static void main(String[]args){
		Scanner cin=new Scanner(System.in);
		String s=cin.nextLine();
		try{
			MessageDigest md=MessageDigest.getInstance("MD5");
			md.update(s.getBytes());
			byte[] digest=md.digest();
			for(byte b:digest)System.out.printf("%02x",b);
		}catch(Exception e){}
		cin.close();
	}
}
