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
    public ListNode sortList(ListNode head) {
        if(head==null) return null;
        return mergesort(head);
    }
    public ListNode mergesort(ListNode head){
        if(head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode right=mergesort(slow.next);
        slow.next=null;
        ListNode left=mergesort(head);
        return merge(left,right);
    }
    public ListNode merge(ListNode left,ListNode right){
        ListNode head=new ListNode();
        ListNode temp=head;
        while(left!=null &&right!=null){
            if(left.val>right.val){
                temp.next=right;
                right=right.next;
            }
            else{
                temp.next=left;
                left=left.next;
            }
            temp=temp.next;
        }
        while(left != null){
            temp.next = left;
            left = left.next;
            temp = temp.next;   
        } 
        while(right != null){
            temp.next = right;
            right = right.next;
            temp = temp.next;   
        }
        return head.next;

    }
}