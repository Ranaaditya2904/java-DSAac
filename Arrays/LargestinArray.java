package Arrays;

public class LargestinArray {
    
    public static int getLargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest)
                largest=arr[i];
        }
        return largest;
    }
    
    public static void main(String[] args){
        int[] arr={1,5,34,66,209};

        System.out.println("The largest element is "+getLargest(arr));
    }
}
