// public class ReverseInPlace {
//     public static void reverse(int[] arr){
//         int i=0;
//         int j=arr.length-1;
//         while(i<j){
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//             i++;
//             j--;
//         }
//         for(int k=0;k<arr.length;k++){
//             System.out.print(arr[k]+ " ");
//         }
        
//     }
//     public static void main(String[] args){
//         int arr[]={9,7,4,0,1,2};
//         reverse(arr);
//     }
// }

public class ReverseInPlace {
    public static void reverse(int[] arr){
        
        for(int i=0, j=arr.length-1; i<j; i++,j--){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+ " ");
        }
        
    }
    public static void main(String[] args){
        int arr[]={9,7,4,0,1,2};
        reverse(arr);
    }
}
