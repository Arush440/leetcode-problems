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
    public void reorderList(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        
        ListNode head2 = slow.next;
        slow.next = null;

        ListNode current = head2,prev = null,front;
        while(current != null){
            front = current.next;
            current.next = prev;
            prev = current;
            current = front;
        }

        ListNode temp1 = head;
        ListNode temp2 = prev;
        while(temp2 != null){
            ListNode first = temp1.next; 
            ListNode second = temp2.next;

            temp1.next = temp2; 
            temp2.next = first;

            temp1 = first; 
            temp2 = second;
        }
        
    }
}