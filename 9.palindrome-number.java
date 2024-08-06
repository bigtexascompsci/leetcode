/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        // `x < 0` ensures `x` is a positive
        // `x % 10 == 0`: checks multiplles of 10
        // `x != 0` ensures that `x` is not a 0
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        // Store the reversed half of the number
        int reversed = 0;

        while (x > reversed) {
            // Add the last digit of `x`
            reversed = (reversed * 10) + (x % 10);

            // Remove the last digit from `x`
            x = x / 10;
        }

        // Check if the number is a palindrome:
        // When `x` has an even number of digits, `reversed` should be equal to `x`.
        // When `x` has an odd number of digits, `reversed` without its last digit `(reversed / 10)` should be equal to `x`.
        return reversed == x || reversed / 10 == x;
    }
}
// @lc code=end

