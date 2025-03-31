class PrefixSum {
    public static int[] computePrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        return prefix;
    }

    public static int rangeSum(int[] prefix, int L, int R) {
        if (L == 0) return prefix[R]; // No need to subtract for L=0
        return prefix[R] - prefix[L - 1];
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int[] prefix = computePrefixSum(arr);

        // Example: Find sum from index 1 to 3 (4 + 6 + 8)
        System.out.println("Sum of range (1,3): " + rangeSum(prefix, 1, 3)); // Output: 18
    }
}
