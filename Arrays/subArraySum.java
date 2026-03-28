public class subArraySum{
    public static void maxSubarraySum(int[] nums){
        int sum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<=nums.length;j++){
                sum=0;
                for(int k=i;k<j;k++){
                    sum+=nums[k];
                    //System.out.print(sum+" ");
                }
                if(sum>maxsum){
                    maxsum=sum;
                }
                System.out.print(sum+" ");
                //System.out.println();
                
            }
            System.out.println();
            
        }
        System.out.print("Max Sum: "+maxsum);
    }
    public static void main(String[] args) {
        int[] nums={1,-2,6,-1,3};
        maxSubarraySum(nums);
    }
}