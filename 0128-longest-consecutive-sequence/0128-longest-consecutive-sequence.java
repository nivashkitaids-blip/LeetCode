class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i:nums){
            hs.add(i);

        }
        int max = 0;
        for(int i:hs){
            if(!hs.contains(i-1)){
                int temp = 1;
                int n =i;
                while(hs.contains(n+1)){
                    n++;
                    temp++;
                }
                max = Math.max(max,temp);
            }

        }
        return max;
        
    }
}