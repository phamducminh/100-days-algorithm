// https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/560/
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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            
            curr.next = prev;
            
            prev = curr;
            curr = next;
        }
        
        return prev;
    }

    public ListNode reverseListRevcursive(ListNode head) {
    if (head == null || head.next == null)
            return head;
        
        // reverse the rest list and put
        // the first element at the end
        ListNode rest = reverseList(head.next);
        head.next.next = head;
        
        head.next = null;
        
        return rest;
    }
}