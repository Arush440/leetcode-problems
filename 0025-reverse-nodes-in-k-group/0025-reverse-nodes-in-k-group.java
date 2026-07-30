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
    public ListNode reverseKGroup(ListNode head, int k) {
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroup = dummy;
        ListNode curr = head;
        int pairs=len/k;
        for(int i=0;i<pairs;i++){
            ListNode groupstart=curr;
            ListNode prev=null;
            for(int j=0;j<k;j++){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            prevGroup.next=prev;
            groupstart.next=curr;
            prevGroup=groupstart;
        }
        return dummy.next;
    }
}