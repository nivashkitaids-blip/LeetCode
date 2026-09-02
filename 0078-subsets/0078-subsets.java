import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for(int k =0;k<(Math.pow(2,n));k++){
            List<Integer> temp = new ArrayList<>();
            for(int i =0;i<n;i++){
                if((k&(1<<(i))) !=0){
                    temp.add(nums[i]);
                }
            }
            result.add(temp);
           
        }
        return result;
    }
}
        