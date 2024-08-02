// https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/771/
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
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        
        while(true) {
            if (list1 == null) {
                tail.next = list2;
                break;
            } else if (list2 == null) {
                tail.next = list1;
                break;
            }
            
            if (list1.val <= list2.val) {
                ListNode temp = new ListNode(list1.val);
                list1 = list1.next;
                tail.next = temp;
            } else {
                ListNode temp = new ListNode(list2.val);
                list2 = list2.next;
                tail.next = temp;
            }
            tail = tail.next;
        }
        
        return dummy.next;
    }
}