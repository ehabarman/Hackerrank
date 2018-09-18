//Date 18-9-2018

package TheHackerRankInterviewPreparationKit.sorting;

import java.util.*;

public class FraudulentActivityNotifications {

    private static int activityNotifications(int[] expenditure, int d) {

        int count = 0;
        int freq[] = new int[201];
        LinkedList<Integer> q = new LinkedList<Integer>();
        for(int i=0;i<expenditure.length;i++)
        {
            while(i<d)
            {
                q.add(expenditure[i]);
                freq[expenditure[i]] = freq[expenditure[i]]+1;
                i++;
            }


            float median = getMedian(freq,d);

            if(expenditure[i] >= 2*median)
            {
                count++;
            }

            int elem = q.remove();
            freq[elem] = freq[elem] - 1;

            q.add(expenditure[i]);
            freq[expenditure[i]] = freq[expenditure[i]]+1;
        }

        return count;
    }

    private static float getMedian(int[] freq,int d)
    {
        if(d%2 == 1)
        {
            int center = 0;
            for(int i=0;i<freq.length;i++)
            {
                center = center + freq[i];

                if(center > d/2)
                {
                    return i;
                }
            }
        }else{
            int count = 0;
            int first = -1;
            for(int i=0;i<freq.length;i++)
            {
                count = count + freq[i];

                if(count == d/2)
                {
                    first = i;
                }else if(count > d/2)
                {
                    if(first < 0 ) first = i;
                    return ((float)first + (float)i)/2;
                }
            }
        }
        return 0f;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d = s.nextInt();
        int[] expenditure = new int[n];
        for (int i = 0; i < n; i++)
            expenditure[i] = s.nextInt();
        int result = activityNotifications(expenditure, d);
        System.out.println(result);
        s.close();
    }
}
