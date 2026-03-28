public class subArraySum2{
    public static void maxSubarraySum2(int[] nums){
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                if(sum>maxsum)
                    maxsum=sum;
            }
        }
        System.out.println("Maximum sum is: "+maxsum);
    }
    public static void main(String[] args) {
        int[] nums={1,-2,6,-1,3};
        maxSubarraySum2(nums);
    }
}