class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> out = new HashMap <>();
        
        for(int i =0; i<nums.length;i++){
            int a = nums[i];
            int b = target-a;
            if(out.containsKey(b)){
                return new int[]{i,out.get(b)};
            }
            else{
                out.put(a,i);
            }
        }
        return null;
    }
}
            