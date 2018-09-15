// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int MOD = 5;
        while(t-->0){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            long newPow = modBinomial(b,c,MOD);
            System.out.println(newPow);
            System.out.println(modPow(a,newPow,MOD));

        }

    }


    public static long modPow(long a, long x, long p) {
        //calculates a^x mod p in logarithmic time.
        long res = 1;
        while(x > 0) {
            if( x % 2 != 0) {
                res = (res * a) % p;
            }
            a = (a * a) % p;
            x /= 2;
        }
        return res;
    }


    public static long modInverse(int a, int m) {
        int m0 = m;
        int y = 0, x = 1;

        if (m == 1)
            return 0;

        while (a > 1)
        {
            // q is quotient
            int q = a / m;

            int t = m;

            // m is remainder now, process
            // same as Euclid's algo
            m = a % m;
            a = t;
            t = y;

            // Update x and y
            y = x - q * y;
            x = t;
        }

        // Make x positive
        if (x < 0)
            x += m0;

        return x;
    }
    public static long modBinomial(int n, int k, int p) {
        long numerator = 1; // n * (n-1) * ... * (n-k+1)
        for (int i=0; i<k; i++) {
            numerator = (numerator * (n-i) ) % p;
        }

        int denominator = 1; // k!
        for (int i=1; i<=k; i++) {
            denominator = (denominator * i) % p;
        }

        // numerator / denominator mod p.
        return ( numerator* modInverse(denominator,p) ) % p;
    }



    // Function to return gcd of a and b
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}