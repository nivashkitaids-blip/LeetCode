class Solution {
    public int rob(int[] nums) {

        int twoPrevious = 0;
        int previous = 0;

        for (int money : nums) {

            int current = Math.max(
                previous,
                twoPrevious + money
            );

            twoPrevious = previous;
            previous = current;
        }

        return previous;
    }
}