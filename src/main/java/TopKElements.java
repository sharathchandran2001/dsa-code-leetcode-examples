import java.util.PriorityQueue;
import java.util.Arrays;

class TopKElements {
    public static int[] findTopKElements(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Min-Heap

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove smallest element to maintain K largest elements
            }
        }

        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll(); // Extract elements from the heap
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 10, 5, 20, 8, 15};
        int k = 3;
        System.out.println("Top " + k + " Elements: " + Arrays.toString(findTopKElements(nums, k)));
    }
}
