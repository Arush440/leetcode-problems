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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null){
            return head;
        }
        if(head.next==null){
            return null;
        }
        ListNode prev=null;
        ListNode fast=head;
        ListNode middle=head;
        while(fast!=null&&fast.next!=null){
            prev=middle;
            fast=fast.next.next;
            middle=middle.next;
        }
        prev.next=middle.next;
        return head;
    }
}