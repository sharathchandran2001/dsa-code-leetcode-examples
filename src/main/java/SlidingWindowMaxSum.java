class SlidingWindowMaxSum {
    public static int maxSum(int[] arr, int k) {
        if (arr.length < k) {
            System.out.println("Invalid input: Window size greater than array length");
            return -1;
        }

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // Compute initial window sum
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k]; // Add new element, remove old element
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum sum of " + k + " consecutive elements: " + maxSum(arr, k));
    }
}
