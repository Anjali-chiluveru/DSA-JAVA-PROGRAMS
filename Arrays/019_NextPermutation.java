class Solution {
    void nextPermutation(int[] arr) {

        int n = arr.length;

        // Step 1: find breakpoint
        int i = n - 2;

        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // Step 2: if breakpoint exists
        if (i >= 0) {

            int j = n - 1;

            while (arr[j] <= arr[i]) {
                j--;
            }

            // swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Step 3: reverse the right part
        reverse(arr, i + 1, n - 1);
    }

    void reverse(int[] arr, int left, int right) {

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
