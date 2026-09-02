/*class Solution {
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
} */
import java.util.Arrays;

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for (int num : nums) totalSum += num;

        // If target is out of achievable range
        if (Math.abs(target) > totalSum) return 0;

        // DP table initialized with -1
        // Size of sum range is [-totalSum, totalSum], offset by totalSum
        int[][] memo = new int[nums.length][2 * totalSum + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return calculateWays(nums, 0, 0, target, totalSum, memo);
    }

    private int calculateWays(int[] nums, int index, int currentSum, int target, int totalSum, int[][] memo) {
        if (index == nums.length) {
            return currentSum == target ? 1 : 0;
        }

        // Offset index for negative sums
        int memoSumIndex = currentSum + totalSum;
        if (memo[index][memoSumIndex] != -1) {
            return memo[index][memoSumIndex];
        }

        int addWays = calculateWays(nums, index + 1, currentSum + nums[index], target, totalSum, memo);
        int subtractWays = calculateWays(nums, index + 1, currentSum - nums[index], target, totalSum, memo);

        return memo[index][memoSumIndex] = addWays + subtractWays;
    }
}