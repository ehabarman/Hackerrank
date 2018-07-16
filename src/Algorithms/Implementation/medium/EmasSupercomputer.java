//Date 14-7-2018
package Algorithms.Implementation.medium;

import java.util.Scanner;

public class EmasSupercomputer {

	static int[][] check;
    static{
        check=new int[20][20];
        for(int i=0;i<20;i++)
            for(int j=0;j<20;j++)
                check[i][j]=0;
    }
    public static boolean validate(String[] mat,int i,int j,int m,int n,int width){
        int dist=(width-1)/2;
        for(int x=-dist;x<=dist;x++){
            int I=i+x;
            if(!(I>-1&&I<n && mat[I].charAt(j)=='G'))
                return false;
            int J=j+x;
            if(!(J>-1&&J<m&&mat[i].charAt(J)=='G'))
                return false;
        }
        return true;
    }
    
    public static boolean isTrue(Square a, Square b,int i,int j){
        int dist=(a.width-1)/2;
        int hash=100*i+j;
        for(int x=-dist;x<=dist;x++){
            int I=a.i+x;int J=a.j+x;
            check[I][a.j]=check[a.i][J]=hash;
        }
        dist=(b.width-1)/2;
        for(int x=-dist;x<=dist;x++){
            int I=b.i+x;int J=b.j+x;
            if(check[I][b.j]==hash||check[b.i][J]==hash)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        String[] mat=new String[n];
        for(int i=0;i<n;i++)
            mat[i]=in.next();
        Square[] arr=new Square[2000];
        int pointer=0;
        int maxlen=Math.min(m,n);
        maxlen-=maxlen%2==0?1:0;
        for(int i=maxlen;i>=1;i-=2)
            for(int j=0;j<n;j++)
                for(int k=0;k<m;k++)
                    if(validate(mat,j,k,m,n,i))
                        arr[pointer++]=new Square(j,k,i);
        int max=-1;
        for(int i=0;i<pointer;i++)
            for(int j=0;j<pointer;j++)
                if(i!=j&&isTrue(arr[i],arr[j],i,j)&&max<(2*arr[i].width-1)*(2*arr[j].width-1))
                    max=(2*arr[i].width-1)*(2*arr[j].width-1);
        System.out.println(max);
        in.close();
    }
}

class Square{
    int i;
    int j;
    int width;
    public Square(int i,int j,int width){
        this.i=i;this.j=j;this.width=width;
    }
    public String toString(){
        return "["+i+"]["+j+"]-->"+width;
    }
}