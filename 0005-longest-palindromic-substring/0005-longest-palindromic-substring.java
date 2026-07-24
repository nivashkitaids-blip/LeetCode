class Solution {
    public int validpalin(int i, int j, String s){
        int count =0;
        while(i>=0 && j<s.length()){
            if(s.charAt(i) != s.charAt(j)){
                return count;
            }
            count++;
            i--;
            j++;
        }
        return count;
    }
    public String longestPalindrome(String s) {
        String res ="";
        int  reslength = 0;
        for(int k =0; k<s.length();k++){
            if(k<s.length()-1 && s.charAt(k) == s.charAt(k+1)){
                int len = validpalin(k,k+1,s);
                if(2*len+2>reslength){
                    reslength = 2*len+2;
                    res=s.substring(k-len+1,k+len+1);
                }
            }
            
            int len = validpalin(k,k,s);
            if(2*len +1 >reslength){
                reslength = 2*len+1;
                res = s.substring(k-len+1,k+len);
                        
                    }

                
                
            }
            return res;
        }
        
    }
