// https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> hashSet = new HashSet<>();
        ListNode res = head;
        ListNode prev = head;

        while (head != null) {
            if (!hashSet.contains(head.val)) {
                hashSet.add(head.val);
                prev = head;
            } else {
                prev.next = head.next;
            }
            head = head.next;
        }
        return res;
    }
}