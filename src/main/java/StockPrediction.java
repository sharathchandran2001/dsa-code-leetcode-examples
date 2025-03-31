class StockPrediction {
    public static int[] predictStockPrices(int[] prices) {
        int[] nextHigh = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = prices.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= prices[i]) {
                stack.pop(); // Remove smaller prices
            }
            nextHigh[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(prices[i]);
        }

        return nextHigh;
    }
}
