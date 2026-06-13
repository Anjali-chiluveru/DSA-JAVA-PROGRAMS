import java.util.HashSet;

class Solution {
    public boolean twoSum(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            if (set.contains(complement)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}
