class Solution {
    public int maxVowels(String s, int k) {
        int maxVowels = 0;
        int currentVowels = 0;

        // Count vowels in the first window of size k
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
        }
        maxVowels = currentVowels;

        // Slide the window across the rest of the string
        for (int i = k; i < s.length(); i++) {
            // Remove the character leaving the window
            if (isVowel(s.charAt(i - k))) {
                currentVowels--;
            }
            // Add the new character entering the window
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
            
            maxVowels = Math.max(maxVowels, currentVowels);
            
            // Early exit optimization if maximum possible vowels for window size k is reached
            
        }

        return maxVowels;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}