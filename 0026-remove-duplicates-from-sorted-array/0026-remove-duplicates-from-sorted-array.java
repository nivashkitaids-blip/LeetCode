class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        // Pointer to place the next unique element
        int insertIndex = 1; 
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If we find a new unique element
            if (nums[i] != nums[i - 1]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        
        // Return the count of unique elements
        return insertIndex;
    }
}