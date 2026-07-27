class Solution {
    public boolean IsAllCowPlaced(int[] position, int m, int n){
       int prev = position[0];
       int cowplaced = 1;
       for(int i =1; i<position.length;i++){
           if(position[i]-prev >= n){
               prev = position[i];
               cowplaced++;
           }
       }
       return cowplaced>=m;
        
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l=1,h=position[position.length-1] - position[0];
        int ans = Integer.MIN_VALUE;
        while(l<=h){
            int mid = (l+h)/2;
            if(IsAllCowPlaced(position,m,mid)){
                ans = Math.max(ans,mid); 
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return ans;
    }
}