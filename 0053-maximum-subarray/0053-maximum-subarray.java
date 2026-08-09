class Solution {
    public int maxSubArray(int[] nums) {
        long maxEndingHere = nums[0];
        long maxSoFar = nums[0];
        for(int i = 1; i<nums.length;i++){
            maxEndingHere = Math.max(nums[i], nums[i]+maxEndingHere);
            maxSoFar = Math.max(maxEndingHere,maxSoFar);
        }
        return (int) maxSoFar;
    }
}