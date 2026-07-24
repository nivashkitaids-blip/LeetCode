class Solution {

    public int validpalin(int i, int j, String s) {

        int count = 0;

        while (i >= 0 && j < s.length()) {

            if (s.charAt(i) != s.charAt(j)) {
                return count;
            }

            count++;
            i--;
            j++;
        }

        return count;
    }

    public String longestPalindrome(String s) {

        String res = "";
        int resLength = 0;

        for (int k = 0; k < s.length(); k++) {

            // Odd length palindrome
            int len = validpalin(k, k, s);

            if (2 * len - 1 > resLength) {
                resLength = 2 * len - 1;
                res = s.substring(k - len + 1, k + len);
            }

            // Even length palindrome
            if (k < s.length() - 1 && s.charAt(k) == s.charAt(k + 1)) {

                len = validpalin(k, k + 1, s);

                if (2 * len > resLength) {
                    resLength = 2 * len;
                    res = s.substring(k - len + 1, k + len + 1);
                }
            }
        }

        return res;
    }
}