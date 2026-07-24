class Solution {
    public boolean isAnagram(String s1, String s2) {
         if (s1.length() != s2.length()) {
            return false;
        }

        // 1. Convert strings to char arrays
        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        // 2. Sort both char arrays using built-in method
        Arrays.sort(array1);
        Arrays.sort(array2);

        // 3. Compare sorted arrays
        return Arrays.equals(array1, array2);
    }
}