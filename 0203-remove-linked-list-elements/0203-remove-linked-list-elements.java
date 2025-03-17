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
    public ListNode removeElements(ListNode head, int val) 
    {
        /*ListNode temp=head;
        int ind=0;
        ListNode prev=head;
        ListNode t=head;
        while(temp!=null)
        {
            if(temp.val==val)
            {
                if(temp==head)
                {    
                  head=head.next;
                  
                }
                else if(temp.next==null)
                {
                    prev.next=null;
                    
                }
                else
                {
                    prev.next=temp.next;
                }
            }
            prev=temp;
            temp=temp.next;
        }
       return head; */
       ListNode ans=new ListNode(-1);
       ListNode dm=null;
       if(head==null)
       {
            return null;
       }
       else if(head.next==null)
       {
            if(head.val==val)
            {
                return null;
            }
            else
            {
                return head;
            }
       }
       else
       {

            ListNode temp=head;
            while(temp!=null)
            {
                if(temp.val!=val)
                {
                    ListNode nn=new ListNode(temp.val);
                    ans.next=nn;
                    if(dm==null)
                    {
                        dm=ans.next;
                    }
                    ans=ans.next;
                }
                temp=temp.next;
            }
       }
       return dm;
    }
}