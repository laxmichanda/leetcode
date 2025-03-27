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
    public ListNode oddEvenList(ListNode head) 
    {
        ListNode temp=head;
        ListNode odd=new ListNode(-1);
        ListNode even =new ListNode(-1);
        ListNode t1=odd;
        ListNode t2=even;
        int n=0;
        while(temp!=null)
        {
            ListNode nn=new ListNode(temp.val);
            if(n%2!=0)
            {
                even.next=nn;
                even=even.next;
            }
            else
            {
                odd.next=nn;
                odd=odd.next;
            }
            temp=temp.next;
            n++;
        }
        even.next=null;
        odd.next=t2.next;
        return t1.next;
    }
}