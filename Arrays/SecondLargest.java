public class SecondLargest {
    public static int findLargest(int[] arr){

        if(arr.length < 2){
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int slargest= Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int curr=arr[i];

            if(largest<curr){
                slargest=largest;
                largest=curr;
                
            }else if(curr > slargest && curr!=largest){
                slargest = curr;
            }
        }
        return slargest;
    }
    public static void main(String[] args){
        int arr[]={1,7,9,6,3};

        int res=findLargest(arr);
        System.out.println(res);
    }
}
