/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        return isValid_aux(s, true);
    }
    public boolean isValid_aux(String s, boolean b) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                for (int j = s.length() - 1; j > i; j--) {
                    if (s.charAt(j) == ')') {
                        System.out.println("FOUND PAIR: " + s.substring(i, j));
                        return isValid_aux(s.substring(i, j), b);
                    }
                    return false;
                }
            }
        }
        return false;
    }
}
// @lc code=end

