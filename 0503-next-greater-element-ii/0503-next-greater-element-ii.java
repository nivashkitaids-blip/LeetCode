class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] ar = new int[n];
        int index = n-1;
        
        for(int i = n-1;i>=0;i--){
            st.add(nums[i]);
         }
        for(int i = n-1;i>=0;i--){
            
                while(!st.isEmpty() && st.peek()<=nums[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ar[index--]=-1;
                    
                }else{
                    ar[index--]=st.peek();
                    
                }
                    
                
            
            st.add(nums[i]);
        }
        
        return ar;
        
        
    }
}