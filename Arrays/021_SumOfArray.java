class Solution {
    public int arraySum(List<Integer> arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum;
    }
}
