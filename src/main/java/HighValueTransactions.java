class HighValueTransactions {
    public static Transaction[] findTopKTransactions(Transaction[] transactions, int k) {
        PriorityQueue<Transaction> minHeap = new PriorityQueue<>((a, b) -> Double.compare(a.amount, b.amount));

        for (Transaction t : transactions) {
            minHeap.offer(t);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the lowest transaction
            }
        }

        return minHeap.toArray(new Transaction[0]);
    }
}
