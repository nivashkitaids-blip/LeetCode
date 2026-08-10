class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int answer = nums[0];
        for(int i = 1;i<nums.length;i++){
            int x = nums[i];
            int oldmax = maxProduct;
            int oldmin = minProduct;
            maxProduct = Math.max(x,Math.max(x*oldmax,x*oldmin));
            minProduct = Math.min(x,Math.min(x*oldmax,x*oldmin));
            answer = Math.max(answer,maxProduct);
        }
        return answer;
        
        
    }
}