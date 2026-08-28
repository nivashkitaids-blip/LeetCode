class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()<1 ) return "";
        int st = 0;
        int e = 0;
        for(int i =0;i<s.length();i++){
            int l1 = fuc(s,i,i);
            int l2 = fuc(s,i,i+1);
            int len = Math.max(l1,l2);
            if(len>e-st){
                st = i-(len-1)/2;
                e = i+len/2;
            }
            
        }
        return s.substring(st,e+1);
    }


    public  int fuc(String s, int left,int right){
        int l = left;
        int r = right;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}