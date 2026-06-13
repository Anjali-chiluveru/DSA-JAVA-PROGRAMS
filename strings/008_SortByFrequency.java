import java.util.*;

class Solution {
    public ArrayList<Integer> sortByFreq(int[] arr) {

        Map<Integer, Integer> freq = new HashMap<>();

        // count frequency
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // convert to list
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            list.add(num);
        }

        // sort by frequency and value
        Collections.sort(list, (a, b) -> {
            if (!freq.get(a).equals(freq.get(b))) {
                return freq.get(b) - freq.get(a); // higher freq first
            } else {
                return a - b; // smaller value first
            }
        });

        return list;
    }
}
