class FraudDetection {
    public static int detectFraud(int[] transactions, int k) {
        int windowSum = 0, maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            windowSum += transactions[i];
        }
        maxSum = windowSum;

        for (int i = k; i < transactions.length; i++) {
            windowSum += transactions[i] - transactions[i - k]; // Slide window
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum; // Maximum transaction sum in rolling window
    }
}
