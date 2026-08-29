class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftprod=new int[n];
        int[] rightprod = new int[n];
        leftprod[0]=1;
        rightprod[n-1]=1;
        for(int i = 1;i<n;i++){
            leftprod[i]=leftprod[i-1]*nums[i-1];
        }
        for(int i = n-2;i>=0;i--){
            rightprod[i]=rightprod[i+1]*nums[i+1];

        }for(int i = 0;i<n;i++){
            if(i==0) nums[i]=rightprod[i];
            if(i==n-1) nums[i]=leftprod[i];
            else nums[i]=leftprod[i]*rightprod[i];
        }
        return nums;
        
        
    }
}