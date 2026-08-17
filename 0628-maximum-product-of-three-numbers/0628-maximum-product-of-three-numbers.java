import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        // Product of the 3 largest elements
        int option1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        
        // Product of the 2 smallest (negative) elements and the largest element
        int option2 = nums[0] * nums[1] * nums[n - 1];
        
        return Math.max(option1, option2);
    }
}