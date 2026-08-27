class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (right+left)/2;

            // If the element to the right is greater, a peak MUST exist on the right
            if (nums[mid] > nums[mid + 1]) {
                              right = mid;
                
            } 
            // Otherwise, a peak lies at mid or to the left
            else {

                  left = mid + 1;
            }
        }

        return left;
    }
}