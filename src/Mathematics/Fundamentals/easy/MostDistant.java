//Date 18-9-2018

package Mathematics.Fundamentals.easy;

import java.util.*;

public class MostDistant {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double minX = Integer.MAX_VALUE;
        double minY = Integer.MAX_VALUE;
        double maxX = Integer.MIN_VALUE;
        double maxY = Integer.MIN_VALUE;

        for(int i = 0 ; i< n ; i++){
            int x = s.nextInt();
            int y = s.nextInt();

            if (x == 0){
                minY= Math.min(minY,y);
                maxY = Math.max(maxY,y);
            }
            else {
                minX= Math.min(minX,x);
                maxX = Math.max(maxX,x);
            }
        }
        double maxDistance = 0;
        maxDistance = Math.max(maxDistance,distance(minX,0,maxX,0));
        maxDistance = Math.max(maxDistance,distance(minX,0,0,maxY));
        maxDistance = Math.max(maxDistance,distance(minX,0,0,minY));
        maxDistance = Math.max(maxDistance,distance(maxX,0,0,minY));
        maxDistance = Math.max(maxDistance,distance(maxX,0,0,maxY));
        maxDistance = Math.max(maxDistance,distance(0,maxY,0,minY));

        System.out.printf("%f",maxDistance);

        s.close();
    }

    public static double distance(double x1,double y1,double x2,double y2){
        double x = Math.pow(x2-x1,2);
        double y = Math.pow(y2-y1,2);
        return Math.sqrt(x+y);
    }
}
