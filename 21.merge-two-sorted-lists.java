/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Base cases for recursion
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // Initialize the head of the merged list
        ListNode head = new ListNode();

        // Choose the smaller value and merge recursively
        if (list1.val <= list2.val) {
            head.val = list1.val;
            head.next = mergeTwoLists(list1.next, list2);
        } else {
            head.val = list2.val;
            head.next = mergeTwoLists(list1, list2.next);
        }

        return head;
    }
}
// @lc code=end

