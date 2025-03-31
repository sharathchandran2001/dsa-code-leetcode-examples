import java.util.Arrays;
import java.util.Stack;

class MonotonicStack {
    public static int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop(); // Remove smaller elements
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]); // Push current element
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 10, 8};
        System.out.println("Next Greater Elements: " + Arrays.toString(nextGreaterElement(nums)));
    }
}
