import java.util.*;
//Q1

/*public class Practice{
    public static int Solution(String s){
        int countstar=0;
        int counthash=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='*'){
                countstar++;
            }else if(s.charAt(i)=='#'){
                counthash++;
            }
        }
        return countstar-counthash;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] arr=s.toCharArray();

        int res = Solution(s);
        System.out.println(res);

    }
}
    */

/*Problem Statement-2

Given an integer array Arr of size N, find the count of elements whose value is greater than all of its prior elements.

Notes
The first element of the array should always be included in the count.
An element contributes to the count only if it is greater than every element that appears before it.
Example
Arr = [7, 4, 8, 2, 9]
7 is counted because it is the first element.
8 is counted because it is greater than all previous elements.
9 is counted because it is greater than all previous elements.

Therefore,

Output = 3
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 1;
        int max = arr[0];

        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                count++;
                max = arr[i];
            }
        }

        System.out.println(count);
    }
}*/



public class Practice{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] arr=sc.nextLine().split(" ");

        HashMap <String,Integer> map=new HashMap<>();

        for(String str:arr){
            if(map.containsKey(str)){
                map.put(str,map.get(str)+1);
            }else{
                map.put(str,1);
            }
        }

        

        for(String key : map.keySet()) {

            if(map.get(key)%2 !=0) {
                System.out.println(key + " -> " + map.get(key));
            }
        }


    }
}