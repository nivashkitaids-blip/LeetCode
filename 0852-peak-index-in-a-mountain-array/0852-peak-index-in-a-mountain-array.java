class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int i=0,j=arr.length-1;
        
        while(i<=j){
            int mid = (i+j)/2;
            if(i==j)return i;
            if(mid > 0 && mid < arr.length-1  && arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid] > arr[mid+1]){
                j=mid-1;
            
            }
            else{
                i=mid+1;
            }
        }
        return i;
        
    }
}