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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        ListNode slow=head;
        ListNode fast=head;
        int counter=0;
        while(fast!=null){
            fast=fast.next;
            counter++;
        }
        k=k%counter;
        if(k==0) return head;
        fast=head;
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        while(fast!=null&&fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;
        return newHead;
    }
}