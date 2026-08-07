import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        // Fix 1: Initialize with the sum of the first 3 elements instead of 0
        int close = nums[0] + nums[1] + nums[2];
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                
                // Fix 2: Check if current sum is closer to target than our recorded close sum
                if (Math.abs(target - sum) < Math.abs(target - close)) {
                    close = sum;
                }
                
                // Fix 3: Standard two-pointer movement relative to target
                if (sum < target) {
                    j++;
                } else {
                    k--;
                }    
            }
        }
        return close;
    }
}