class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int cursum = 0;
        for(int i =0;i<k;i++){
            cursum = cursum+cardPoints[i];
        }
        int maxsum = cursum;
        for(int i =1;i<=k;i++){
            cursum = cursum+cardPoints[n-i]-cardPoints[k-i];
            maxsum = Math.max(maxsum,cursum);
        }
        return maxsum;
         
    }
}