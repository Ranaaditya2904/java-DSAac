package Recurssion;
import java.util.*;

public class OneTon {
    public static void CalcRes(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        CalcRes(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        CalcRes(n);
    }
}
