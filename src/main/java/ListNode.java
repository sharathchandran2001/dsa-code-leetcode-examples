class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class FastSlowPointers {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow by 1 step
            fast = fast.next.next;     // Move fast by 2 steps

            if (slow == fast) return true; // Cycle detected
        }

        return false; // No cycle
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next; // Creating a cycle

        System.out.println("Cycle detected: " + hasCycle(head)); // Output: true
    }
}
