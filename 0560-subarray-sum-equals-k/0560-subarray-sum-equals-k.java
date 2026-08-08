class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int cursum = 0;
        int count = 0;
        for(int x : nums){
            cursum += x;
            int need = cursum - k;
            if(map.containsKey(need)){
                count = count+map.get(need);
            }
            map.put(cursum,map.getOrDefault(cursum,0)+1);
        }
        return count;
    }
}