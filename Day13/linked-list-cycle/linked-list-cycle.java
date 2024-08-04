// https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/773/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> hashSet = new HashSet<>();
        while (head != null) {
            if (hashSet.contains(head)) {
                return true;
            } else {
                hashSet.add(head);    
            }
            head = head.next;
        }
        
        return false;
    }

    public boolean hasCycle1(ListNode head) {
        ListNode slow = head;
        ListNode fast = slow;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                return true;
            }
        }
        
        return false;
    }
}