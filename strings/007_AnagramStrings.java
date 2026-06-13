class Solution {
    public boolean areAnagrams(String s1, String s2) {

        // if lengths differ, cannot be anagram
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] freq = new int[26];

        // count characters in s1
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        // subtract characters using s2
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i) - 'a']--;
        }

        // check if all frequencies are zero
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
