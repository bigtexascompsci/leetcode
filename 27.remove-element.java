/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                // Find the first non-`val` integer
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != val) {
                        // Swap elements
                        int temporary = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temporary;
                        break;
                    }
                }
            }
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                break;
            }
            count++;
        }
        return count;
    }
}
// @lc code=end

