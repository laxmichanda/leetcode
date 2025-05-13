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
    public Node copyRandomList(Node head) 
    {
        if(head==null)return  null;
        Node p=head;
        while(p!=null)
        {
            Node copied=new Node(p.val);
            copied.next=p.next;
            p.next=copied;
            p=copied.next;
        }
        p=head;
        while(p!=null)
        {
            if(p.random!=null)
            p.next.random=p.random.next;
            p=p.next.next;
        }
        Node ptr=head.next;
        Node ans=ptr;
        while(head!=null)
        {
            head.next=head.next.next;
            ptr.next=ptr.next!=null?ptr.next.next:null;
            
            head=head.next;
            ptr=ptr.next;
        }
        return ans;
        
    }
}