/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        return searchInsert_aux(nums, target, 0, nums.length - 1);
    }

    public int searchInsert_aux(int[] nums, int target, int leftIndex, int rightIndex) {
        if (leftIndex > rightIndex) {
            return leftIndex;
        }

        int centerIndex = leftIndex + (int) Math.floor((rightIndex - leftIndex) / 2);

        if (target == nums[centerIndex]) {
            return centerIndex;
        } else if (target < nums[centerIndex]) {
            return searchInsert_aux(nums, target, leftIndex, centerIndex - 1);
        } else {
            return searchInsert_aux(nums, target, centerIndex + 1, rightIndex);
        }
    }
}
// @lc code=end

