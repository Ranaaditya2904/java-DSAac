//given rows and cols, find the elements at that given place

import java.util.*;

public class PTriangle{
    public static long ncr(int n, int r){
        long res = 1;
        for(int i=0; i<r; i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }

    public static long findElement(int r, int c){
        return ncr(r-1, c-1);
    }

    public static void printnRow(int n){
        long ans=1;
        System.out.print(ans+" ");

        for(int i=1;i<n;i++){
            ans = ans * (n-i);
            ans=ans/i;
            System.out.print(ans+" ");
        }
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //int r=sc.nextInt();
        //int c=sc.nextInt();

        //System.out.println("Element="+findElement(r, c));
        printnRow(4);
    }
}