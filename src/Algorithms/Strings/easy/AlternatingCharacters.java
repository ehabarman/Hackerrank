//Date 30-9-2018

package Algorithms.Strings.easy;

import java.util.*;
public class AlternatingCharacters {

    static int alternatingCharacters(String s) {
        int j=0;
        int count=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(j) == s.charAt(i)){
                count++;
                j++;
            }
            else {
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int t = Integer.parseInt(s.nextLine());

        while(t-->0){
            String word = s.nextLine();
           System.out.println( alternatingCharacters(word) );
        }

        s.close();

    }
}
