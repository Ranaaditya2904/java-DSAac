package Arrays;

public class BinarySearch {
    public static int SearchElement(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key)
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90};
        int key=30;
        int index=SearchElement(arr,key);
        System.out.println("Element found at"+index);
    }
}
