package Recurssion;

import java.util.Scanner;

public class SumNumbers {

    public static int Sum(int n){
        if(n==1||n==0)
            return n;
        return n+Sum(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result= Sum(n);
        System.out.println(result);
    } 
}
