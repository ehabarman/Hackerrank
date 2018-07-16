//Date 10-7-2018
package Java_Proficiency.easy;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m =in.nextInt();
        int n =in.nextInt();
        BitSet bs1 = new BitSet(m);
        BitSet bs2 = new BitSet(m);
  
        for(int i=0;i<n;i++)
            {
                 String op = in.next();
                 int s1= in.nextInt();
                int s2 =in.nextInt();
            if(op.equals("AND") || op.equals("OR")|| op.equals("XOR"))
                {    
                 if(s1 == 1)
                {
                   switch(op)
                       {
                    case "AND" : bs1.and(bs2); 
                           break;
                    case "OR"  : bs1.or(bs2);
                           break;
                    case "XOR"  : bs1.xor(bs2); }
            }
            else
             {
                switch(op) {
                    case "AND" : bs2.and(bs1);
                        break;
                    case "OR"  : bs2.or(bs1);
                        break;
                    case "XOR"  : bs2.xor(bs1); }
            }   
            }
            if(op.equals("SET") || op.equals("FLIP"))
                {
                if(s1==1)
                    {
                    switch(op) {
                        case "SET" : bs1.set(s2);
                            break;
                        case "FLIP" : bs1.flip(s2);
                    }
                }
                    else
                        {
                        switch(op) {
                        case "SET" : bs2.set(s2);
                                break;
                        case "FLIP" : bs2.flip(s2);
                    }
                    }
                }
             System.out.println(bs1.cardinality()+" "+bs2.cardinality());
            
            }
        in.close();
        }
}
