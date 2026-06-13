import java.util.*;

class Solution {
    public String reverseWords(String s) {

        String[] parts = s.split("\\.");

        List<String> words = new ArrayList<>();

        // collect non-empty words
        for (String word : parts) {
            if (word.length() > 0) {
                words.add(word);
            }
        }

        // reverse order
        Collections.reverse(words);

        // build result
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < words.size(); i++) {
            res.append(words.get(i));
            if (i != words.size() - 1) {
                res.append(".");
            }
        }

        return res.toString();
    }
}
