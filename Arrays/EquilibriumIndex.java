

// A logistics company stores the daily load handled by warehouses in an array.
// The management wants to identify a warehouse position such that:

// total load on the LEFT side equals
// total load on the RIGHT side

// Write a program to find the equilibrium index.

import java.util.*;
public class EquilibriumIndex {
    public static int equilibriumIndex(int[] arr){
        for(int i=0;i<arr.length;i++){
            int leftSum=0;
            int rightSum=0;

            for(int j=0;j<i;j++){
                leftSum += arr[j];
            }

            for(int j=i+1; j<arr.length; j++){
                rightSum += arr[j];
            }

            if(leftSum==rightSum){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,3,5,2,2};
        int result=equilibriumIndex(arr);
        System.out.println(result);
    }
}

