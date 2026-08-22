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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length<1) return null;
        ListNode merged=lists[0];
        for(int i=1;i<lists.length;i++){
            merged=merge2(merged,lists[i]);
        }
        return merged;
    }
    public ListNode merge2(ListNode merged,ListNode l2){
        ListNode dummy=new ListNode(-1);
        ListNode res=dummy;
        while(merged!=null&&l2!=null){
            if(merged.val<l2.val){
                res.next=merged;
                res=merged;
                merged=merged.next;
            }
            else{
                res.next=l2;
                res=l2;
                l2=l2.next;
            }
        }
        if(merged!=null){
            res.next=merged;
        }
        if(l2!=null){
            res.next=l2;
        }
        return dummy.next;
    }
}