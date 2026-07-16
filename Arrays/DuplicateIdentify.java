/*Find the First Duplicate Element in an Array

Given an integer array arr of size n, return the first duplicate element present in the array. 
If there are multiple duplicate values, return the one that is encountered first while scanning the array from left to right. 
If no duplicate exists, return -1.
*/

public class DuplicateIdentify {
    public static int findDuplicate(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,2,5,7,8,8};
        System.out.println(findDuplicate(arr));
    }
}
