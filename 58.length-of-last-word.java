/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int endOfWordIndex = s.length();
        int startOfWordIndex = -1;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                endOfWordIndex--;
            } else {
                startOfWordIndex = endOfWordIndex;
                for (int j = endOfWordIndex - 1; j >= 0; j--) {
                    if (s.charAt(j) != ' ') {
                        startOfWordIndex--;
                    } else {
                        break;
                    }
                }
                
                break;
            }
        }

        return endOfWordIndex - startOfWordIndex;
    }
}
// @lc code=end

