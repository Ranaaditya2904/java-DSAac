package Recurssion;
import java.util.*;
public class nTo1 {
    public static void CalcRes(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        CalcRes(n-1);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        CalcRes(n);

    
}
}
