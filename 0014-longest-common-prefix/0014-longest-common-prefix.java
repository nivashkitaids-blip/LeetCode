class Solution {
    public String longestCommonPrefix(String arr[]) {
        String s ="";
        for(int i =0; i<arr[0].length();i++){
            char c = arr[0].charAt(i);
            for(int j =1; j<arr.length;j++){
                if(i>= arr[j].length() || c !=arr[j].charAt(i)){
                    return s;
                }
            }
            s = s+c;
        }
        return s;
        
    }
}