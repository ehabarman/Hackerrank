import java.util.*;
public class Main {

	public static final int MAXN = 3010;
	public static final int MOD = 1000000007;
	public static int[][] Binom = new int[ MAXN + 1 ][ MAXN + 1 ];
	

	
	
	public static void main(String []args) {
	    calc();
	    Scanner s = new Scanner(System.in);
	    int T = s.nextInt();
	    for( int t = 1; t <= T; t++ ) {
	        int a = s.nextInt();
	        int b = s.nextInt();
	        int c = s.nextInt();
	       
	        long binom;
	        if( b <= 3000 && c <= 3000 ) {
	            binom = Binom[ b ][ c ];
	        }  
	        else {
	            binom = fact( b ) % ( ( MOD - 1 )  );
	            binom = ( binom * inverse( fact( c ), ( MOD - 1 ) / 2 ) ) %  ( ( MOD - 1 )  );
	            binom = ( binom * inverse( fact( b - c ), ( MOD - 1 ) / 2 ) ) % ( ( MOD - 1 ) );
	        }
	        System.out.println(power(a,binom,MOD));
	    }
	    s.close();
	}
	
	public static void calc() {
	    for( int i = 0; i <= MAXN; i++ ) Binom[ i ][ 0 ] =1;
	    for( int i = 1; i <= MAXN; i++ ) {
	        for( int j = 1; j <= i; j++ ) {
	            Binom[ i ][ j ] = ( Binom[ i - 1 ][ j ] + Binom[ i - 1 ][ j - 1 ] ) % ( MOD - 1 );
	        }
	    }
	}
	
	public static long power( long a, long b, int MOD) {
	    if( b == 0 || a == 1 ) 
	    	return 1;
	    else if( b == 1 ) 
	    	return a;
	    long val = power( a, b / 2,MOD) % MOD;
	    if( b % 2 == 1) 
	    	return ( ( val * val ) % MOD ) * a % MOD;
	    else 
	    	return ( val * val ) % MOD;
	}
	
	public static long fact( long a ) {
	    long factorial = 1;
	    for( long i = 1; i <= a; i++ ) 
	    	factorial = ( factorial * i ) % ( MOD - 1 );
	    return factorial;
	}
	
	public static long inverse( long a, long p ) {
		  return ( extended_euclidean( a, p ).X + p ) % p;
	}
	
	public static Pair extended_euclidean( long a, long b ) {
		  if( b == 0 ) 
			  return new Pair( 1, 0 );
		  
		  Pair A = extended_euclidean( b, a % b );
		  return new Pair( A.Y, ( A.X - A.Y * ( a / b ) ) );
	}
	
	
}

class Pair{
	
	public long X;
	public long Y;
	
	public Pair(long X,long Y) {
		this.X = X;
		this.Y = Y;
	}
}
