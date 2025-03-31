class TwoPointerPalindrome {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // Mismatch found
            }
            left++;  // Move left pointer forward
            right--; // Move right pointer backward
        }

        return true; // No mismatches, it's a palindrome
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println("Is Palindrome? " + isPalindrome(str)); // Output: true

        String str2 = "hello";
        System.out.println("Is Palindrome? " + isPalindrome(str2)); // Output: false
    }
}
