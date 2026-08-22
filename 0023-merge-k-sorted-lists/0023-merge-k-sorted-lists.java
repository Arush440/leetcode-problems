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
        int interval=1;
        while(interval < lists.length){
            for(int i = 0; i + interval < lists.length; i += interval * 2){
                lists[i]=merge2(lists[i],lists[i+interval]);
            }
            interval*=2;
        }
        return lists[0];
    }
    public ListNode merge2(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(-1);
        ListNode res=dummy;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                res.next=l1;
                res=l1;
                l1=l1.next;
            }
            else{
                res.next=l2;
                res=l2;
                l2=l2.next;
            }
        }
        if(l1!=null){
            res.next=l1;
        }
        if(l2!=null){
            res.next=l2;
        }
        return dummy.next;
    }
}