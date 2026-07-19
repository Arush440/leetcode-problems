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
        Stack<Integer> s=new Stack<>();
        ListNode stack=head;
        while(stack!=null){
            s.push(stack.val);
            stack=stack.next;
        }
        stack=head;
        while(stack!=null){
            if(stack.val!=s.pop()) return false;
            stack=stack.next;
        }
        return true;
    }
}