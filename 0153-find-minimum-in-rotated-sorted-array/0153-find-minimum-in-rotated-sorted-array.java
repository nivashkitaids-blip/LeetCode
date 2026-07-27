class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right)  / 2;

            // If mid element is greater than the rightmost element,
            // the minimum MUST be in the right half (excluding mid)
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } 
            // Otherwise, mid could be the minimum, or it's in the left half
            else {
                right = mid;
            }
        }

        return nums[left];
    }
}