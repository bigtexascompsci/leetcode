/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;

        for (int i = 1; i < nums.length; i++) {
            if(nums[k] != nums[i]) {
                k++;
                nums[k] = nums[i];
            }
        }

        return k + 1;
    }
}
// @lc code=end

