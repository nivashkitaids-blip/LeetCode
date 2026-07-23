class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxwater = Integer.MIN_VALUE;
        while (i<j){
            int tempwater = (j-i)*Math.min(height[i],height[j]);
            maxwater =Math.max(maxwater,tempwater);
            if(height[j]>= height[i]){
                i++;
            }else{
                j--;
            }
        }
        return maxwater;
        
    }
}