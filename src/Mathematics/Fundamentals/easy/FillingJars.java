//Date 18-9-2018

package Mathematics.Fundamentals.easy;

import java.math.BigInteger;
import java.util.*;

public class FillingJars {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        BigInteger sum = BigInteger.ZERO;
        long a,b,c;
        for(int i = 0 ; i<M ; i++){
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
            sum = sum.add( new BigInteger(""+(b-a+1)*c));
        }
        System.out.println( sum.divide(new BigInteger(""+N)));
        s.close();
    }
}
