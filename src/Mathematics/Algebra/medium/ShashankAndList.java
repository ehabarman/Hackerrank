//Date 3-10-2018

package Mathematics.Algebra.medium;

import java.util.Scanner;

public class ShashankAndList {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int[] arr = new int[t];
        for(int i =0;i<t;i++)
            arr[i]=s.nextInt();

        long result=1;
        int MOD = 1000000007;
        for(int i =0;i<t;i++)
            result= (result*(fastModularPower(2,arr[i],MOD)+1))%MOD;

        System.out.println(result-1);
    }

    public static long fastModularPower(long num, long pow, long m)
    {
        long res = 1;
        num = num % m;
        while (pow > 0)
        {
            if((pow & 1)==1)
                res = (res * num) % m;
            pow = pow >> 1;
            num = (num * num) % m;
        }
        return res;
    }
}
