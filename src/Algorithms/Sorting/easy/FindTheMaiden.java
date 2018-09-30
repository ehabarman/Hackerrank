// Date 30-9-2018

package Algorithms.Sorting.easy;

import java.util.*;

public class FindTheMaiden {

    static int n;
    public static int partition(int[] a, int f, int l)
    {
        int pivot= a[l];
        int i,p_in=0;
        int temp;
        for(i=f;i<l;i++)
        {
            if(a[i]<=pivot)
            { temp=a[i];
                a[i]=a[p_in];
                a[p_in]=temp;
                p_in++;
            }
        }
        temp= a[p_in];
        a[p_in]=a[l];
        a[l]=temp;
        return p_in;
    }



    public static void quickSort(int[] a, int s, int e)
    {
        int mid= (n-1)/2;
        int p_index;
        if(s<e)
        {
            p_index= partition(a,s,e);

            if(p_index==mid)
            {   System.out.println(a[p_index]);
                return;
            }
            if(p_index>mid)
            {
                quickSort(a,s,p_index-1);
            }
            if(p_index<mid)
            { quickSort(a,p_index+1,e);
            }

        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        int i;
        int []a= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        quickSort(a,0,n-1);
    }
}