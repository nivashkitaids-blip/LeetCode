class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currentMax = nums[0];
        int maxSum = nums[0];
        int currentMin = nums[0];
        int totalSum = nums[0];
        int minSum = nums[0];
        for(int i =1; i<nums.length; i++){
            
            totalSum = totalSum+nums[i];
            currentMax = Math.max(nums[i],nums[i]+currentMax);
            maxSum = Math.max(maxSum,currentMax);
            currentMin = Math.min(nums[i],nums[i]+currentMin);
            minSum = Math.min(minSum,currentMin);
            
        }
    if (maxSum < 0) {
        return maxSum;
    }
    int circularMax = totalSum - minSum;

    return Math.max(maxSum, circularMax);
        
    }
}