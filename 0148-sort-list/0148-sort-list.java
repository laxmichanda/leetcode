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
class Solution 
{
    public static ListNode findMid(ListNode h)
    {
        if(h==null || h.next==null)
        {
            return h;
        }
        ListNode slow=h;
        ListNode fast=h;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static ListNode merge(ListNode h1,ListNode h2)
    {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(h1!=null && h2!=null)
        {
            if(h1.val<h2.val )          {
                ListNode nn=new ListNode(h1.val);
                dummy.next=nn;
                dummy=dummy.next;
                h1=h1.next;
            }
            else
            {
                ListNode nn=new ListNode(h2.val);
                dummy.next=nn;
                dummy=dummy.next;
                h2=h2.next;
            }
        }
        if(h1==null)
        {
            h1=h2;
        }
        while(h1!=null)
        {
            ListNode nn=new ListNode(h1.val);
                dummy.next=nn;
                dummy=dummy.next;
                h1=h1.next;
        }
        return temp.next;
    }
    public ListNode sortList(ListNode head) 
    {
        if( head==null ||head.next==null)
        {
            return head;
        }   
        ListNode mid=findMid(head);
        ListNode sh=mid.next;
        mid.next=null;
        ListNode s1=sortList(head);
        ListNode s2=sortList(sh);
        ListNode s3=merge(s1,s2);
        return s3;
    }
}