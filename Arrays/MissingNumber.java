public class MissingNumber {
    public static int missing(int[] arr,int n){
        int sum=0;
        int expSum = n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
            sum=sum + arr[i];
        }

        return expSum-sum;
    }
    public static void main(String[] args){
        int arr[]={1,2,4,5};
        int n=5;

        int res = missing(arr, n);
        System.out.println(res);


    }
}
