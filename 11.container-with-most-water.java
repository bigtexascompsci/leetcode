/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int leftmostIndex = 0;
        int rightmostIndex = height.length - 1;

        int areaOfWater = 0;

        while(leftmostIndex < rightmostIndex) {
            areaOfWater = Math.max(areaOfWater, Math.min(height[leftmostIndex], height[rightmostIndex]) * (rightmostIndex - leftmostIndex));
            
            if (height[leftmostIndex] < height[rightmostIndex]) {
                leftmostIndex++;
            } else {
                rightmostIndex--;
            }
        }

        return areaOfWater;
    }
}
// @lc code=end

