/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp=head;
        while(temp!=null){
            Node node=new Node(temp.val);
            node.next=temp.next;
            temp.next=node;
            temp=node.next;
        }
        temp=head;
        while(temp!=null){
           Node node =temp.next;
           if(temp.random==null) node.random=null;
           else node.random=temp.random.next;
           temp=temp.next.next;
        }
        Node dummy=new Node(-1);
        Node res=dummy;
        temp=head;
        while(temp!=null){
            res.next=temp.next;
            temp.next=temp.next.next;
            res=res.next;
            temp=temp.next;
        }
    return dummy.next;
    }
}