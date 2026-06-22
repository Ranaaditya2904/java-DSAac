import java.util.*;

public class Solution {

    public static void nextPermutation(int[] nums) {
        int n = nums.length;

        // Step 1: Find pivot
        int piv = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                piv = i;
                break;
            }
        }

        // Step 2: If no pivot found, reverse entire array
        if (piv == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find the next greater element from the right
        for (int i = n - 1; i > piv; i--) {
            if (nums[i] > nums[piv]) {
                int temp = nums[i];
                nums[i] = nums[piv];
                nums[piv] = temp;
                break;
            }
        }

        // Step 4: Reverse the suffix
        reverse(nums, piv + 1, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        nextPermutation(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}