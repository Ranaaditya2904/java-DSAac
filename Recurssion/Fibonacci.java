package Recurssion;
import java.util.*;
public class Fibonacci {
    public static int CalcFib(int n){
      if(n==0 || n==1){
        return n;
      }

    //   int fnm1 = CalcFib(n-1);
    //   int fnm2 = CalcFib(n-2);
    //   int fn = fnm1 + fnm2;
    //   return fn;
      return CalcFib(n-1) + CalcFib(n-2);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        // System.out.println(CalcFib(n-1)); // if 0 becomes the first term 
        System.out.println(CalcFib(n));
    }
}
