/*
 * @lc app=leetcode id=2053 lang=java
 *
 * [2053] Kth Distinct String in an Array
 */

// @lc code=start

import java.util.LinkedHashMap;

class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> frequencies = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (frequencies.containsKey(arr[i])) {
                frequencies.put(arr[i], frequencies.get(arr[i]) + 1);
            } else {
                frequencies.put(arr[i], 1);
            }
        }

        int counter = 1;
        for (String key : frequencies.keySet()) {
            if (frequencies.get(key) == 1) {
                if (counter == k) return key;
                counter += 1;
            }
        }

        return "";
    }
}

// @lc code=end

