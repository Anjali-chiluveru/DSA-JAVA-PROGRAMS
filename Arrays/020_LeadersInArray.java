import java.util.ArrayList;
import java.util.Collections;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {

        ArrayList<Integer> res = new ArrayList<>();

        int maxRight = arr[arr.length - 1];
        res.add(maxRight);

        // traverse from right to left
        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                res.add(maxRight);
            }
        }

        // reverse result to maintain order
        Collections.reverse(res);

        return res;
    }
}
