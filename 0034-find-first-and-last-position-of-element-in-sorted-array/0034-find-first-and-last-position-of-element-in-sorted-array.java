class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fo = -1;
        int lo=-1;
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(nums[mid] == target){
                fo=mid;
                j=mid-1;
            }
            else if(nums[mid]>target){
                j=mid-1;

            }
            else{
                i=mid+1;
            }
        }
        i=0;
        j=nums.length-1;
        while(i<=j){
            int mid =(i+j)/2;
            if(nums[mid] == target){
                lo=mid;
                i=mid+1;

            }
            else if(nums[mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return new int[]{fo,lo};
        
    }
}