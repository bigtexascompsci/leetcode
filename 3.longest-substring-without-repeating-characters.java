/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> characters = new HashSet<>();

        int i = 0;
        int length = 0;

        for (int j = 0; j < s.length(); j++) {
            while (characters.contains(s.charAt(j))) {
                characters.remove(s.charAt(i));
                i += 1;
            }
            characters.add(s.charAt(j));
            length = Math.max(length, j - i + 1);
        }

        return length;
    }
}
// @lc code=end

