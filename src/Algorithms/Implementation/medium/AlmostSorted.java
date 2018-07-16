//Date 13-7-2018
package Algorithms.Implementation.medium;

import java.util.Scanner;

public class AlmostSorted {

	public static void main(String[] args) {
	       
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] num= new int [n];
        for(int i=0;i<n;i++)
            {
            num[i]=s.nextInt();
        }
            int firstIndex=-1;
            int lastIndex=-1;
            int counter=0;
            int end=-1;
            int swapflag=0;
            int reverseflag=0;
        for(int i=0;i<n-1;i++)
            {
        	
            if(num[i]<num[i+1])
                continue;
            else{
                
               
                counter++;
                if(counter>1){
                	if(swapflag!=0){
                	int temp = num[end];
                	num[end]=num[firstIndex];
                	num[firstIndex]=temp;
                	}
                	break;
                }
                 
                firstIndex=i;
                i++;
                for(;i<n;i++)
                    {
                    if(i==n-1)//if reached end
                        {
                        if(firstIndex==0 && num[i]<=num[firstIndex+1])//end and first is 0
                            {
                        	end=i;
                            int temp=num[i];
                            num[i]=num[firstIndex];
                            num[firstIndex]=temp;
                            lastIndex=i;
                            if(n>2)
                            i=firstIndex;
                            swapflag++;
                            break;
                        }
                        else if (firstIndex!=0&&num[i]>=num[firstIndex-1] &&num[i]<=num[firstIndex+1] ) //end and mid
                            {
                        	end=i;
                            int temp=num[i];
                            num[i]=num[firstIndex];
                            num[firstIndex]=temp;
                            lastIndex=i;
                            if(n>2)
                            i=firstIndex;
                            swapflag++;
                            break;
                        }
                        else if(firstIndex==0&&num[i]<=num[firstIndex+1] )
                           break;
                    }
                  
                    else if(firstIndex!=0&&num[i]>=num[firstIndex-1]&&num[i]<=num[firstIndex+1]&&num[firstIndex]>=num[i-1]&&num[firstIndex]<=num[i+1])// mid and mid
                        {
                    		end=i;
                            int temp=num[i];
                            num[i]=num[firstIndex];
                            num[firstIndex]=temp;
                            lastIndex=i;
                            if(n>2)
                            i=firstIndex;
                            swapflag++;
                            break;
                    }
                    else if(firstIndex==0&&num[i]<=num[firstIndex+1]&&num[firstIndex]>=num[i-1]&&num[firstIndex]<=num[i+1])
                    {
                    	end=i;
                        int temp=num[i];
                        num[i]=num[firstIndex];
                        num[firstIndex]=temp;
                        lastIndex=i;
                        if(n>2)
                        i=firstIndex;
                        swapflag++;
                        break;
                     }
                    else
                        continue;
                }
               
            }
            
            }
        ;
        if(counter==0)
               {
                System.out.println("yes");
                return;
            } 

            if(counter==1 && lastIndex!=-1)
                {
                System.out.println("yes");
                System.out.println("swap"+" "+(firstIndex+1)+" "+(lastIndex+1));
                return;
            }
            
           
            for(int j=firstIndex;j<n-1;j++)
                {
                if(num[j]>num[j+1])
                    {
                    lastIndex=j;	                  
                    continue;
                }
                else
                {
                	lastIndex=j;
                	reverseflag++;
                    int swap=num[j];
                    num[j]=num[firstIndex];
                    num[firstIndex]=swap;
                    while(j<n-1)
                    {
                    if(num[j]<num[j+1])
                        {
                        j++;
                        continue;
                    }
                    else
                        {
                        System.out.println("no");
                        return;
                    }
                    
                           
                      
                }
                
            }
            }
            if(reverseflag==0)
            	lastIndex++;
            
            if(num[lastIndex]<num[0]||num[firstIndex]<num[0])
                System.out.println("no");
           else{
              System.out.println("yes");
            
            System.out.println("reverse"+" "+(firstIndex+1)+" "+(lastIndex+1));  
           }
       
            
        }
}
