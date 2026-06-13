class Solution {
    public boolean areIsomorphic(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for (int i = 0; i < s1.length(); i++) {

            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            // if mapping not matched before
            if (map1[c1] != map2[c2]) {
                return false;
            }

            // store position + 1 (to avoid default 0 confusion)
            map1[c1] = i + 1;
            map2[c2] = i + 1;
        }

        return true;
    }
}
