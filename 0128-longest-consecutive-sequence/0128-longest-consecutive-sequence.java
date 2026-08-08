class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Put all numbers into HashSet
        for (int x : nums) {
            set.add(x);
        }

        int max = 0;

        // Check every number
        for (int x : set) {

            // x is the beginning of a sequence
            if (!set.contains(x - 1)) {

                int current = x;
                int length = 1;

                // Count consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                max = Math.max(max, length);
            }
        }

        return max;
    }
}