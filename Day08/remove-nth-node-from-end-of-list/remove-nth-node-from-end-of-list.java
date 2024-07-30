// https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/603/
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy;
        ListNode right = head;
        
        while (n > 0 && right != null) {
            right = right.next;
            n--;
        }
        
        while (right != null) {
            left = left.next;
            right = right.next;
        }
        
        // delete node
        left.next = left.next.next;
        return dummy.next;
        
    }
}