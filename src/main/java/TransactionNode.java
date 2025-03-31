class TransactionNode {
    int transactionId;
    double amount;
    TransactionNode next;

    TransactionNode(int transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.next = null;
    }
}

class ReverseTransactionHistory {
    public static TransactionNode reverseTransactions(TransactionNode head) {
        TransactionNode prev = null, current = head, next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev; // New head
    }
}
