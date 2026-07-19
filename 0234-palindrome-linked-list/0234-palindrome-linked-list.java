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
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) return true;
        Stack<Integer> s=new Stack<>();
        ListNode stack=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            s.push(stack.val);
            stack=stack.next;
            fast=fast.next.next;
        }
        if(fast!=null) stack=stack.next;
        while(stack!=null){
            if(stack.val!=s.pop()) return false;
            stack=stack.next;
        }
        return true;
    }
}