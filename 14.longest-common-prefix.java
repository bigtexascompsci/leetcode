/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Check if the input array is null or empty
        if (strs == null || strs.length == 0) {
            return ""; // Return an empty string if the input is invalid or empty
        }

        // Initialize the prefix with the first string in the array
        String prefix = strs[0];

        // Iterate through the rest of the strings in the array
        for (int i = 1; i < strs.length; i++) {
            // Check if the current prefix is not a prefix of the current string
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce the prefix by removing the last character
                prefix = prefix.substring(0, prefix.length() - 1);
                // Exit the loop if the prefix becomes empty
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        // Return the longest common prefix found
        return prefix;
    }
}

// @lc code=end

