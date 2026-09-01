class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return calculateWays(nums, 0, 0, target);
    }
    private int calculateWays(int[] nums, int index, int currentSum, int target) {
        if (index == nums.length) {
            if (currentSum == target) {
                return 1;
            } else {
                return 0;
            }
        }
        int addWays = calculateWays(nums, index + 1, currentSum + nums[index], target);
        int subtractWays = calculateWays(nums, index + 1, currentSum - nums[index], target);
        return addWays + subtractWays;
    }
}