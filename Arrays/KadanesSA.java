public class KadanesSA { 
    public static void maxSum(int[] nums){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];

            if(currSum<0){
                currSum=0;
            }

            maxSum=Math.max(currSum,maxSum);
        }

        System.out.println("Maximum sum is"+maxSum);
    }

    public static void main(String[] args){
        int[] nums={-2,-3,4,-1,-2,1,5,-3};
        maxSum(nums);
    }    
}

// public class KadanesSA { 
//     public static void maxSum(int[] nums){
//         int currSum = nums[0];
//         int maxSum = nums[0];

//         for(int i=1;i<nums.length;i++){
//             currSum = Math.max(nums[i], currSum + nums[i]);
//             maxSum = Math.max(maxSum, currSum);
//         }

//         System.out.println("Maximum sum is " + maxSum);
//     }

//     public static void main(String[] args){
//         int[] nums={-2,-3,4,-1,-2,1,5,-3};
//         maxSum(nums);
//     }    
// }
