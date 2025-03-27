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
    public static ListNode rev(ListNode head)
    {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null)
        {
            ListNode nn=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nn;
        }
        return prev;
    }
    public void reorderList(ListNode head) 
    {
        if(head==null || head.next==null || head.next.next==null)
        {
            return;
        }
        ListNode mid=findMid(head);
        ListNode k=head;
        ListNode revh=rev(mid.next); 
        while(revh!=null)
        {
            ListNode temp=k.next;
            k.next=revh;
            revh=temp;
            k=k.next;
        } 
        k.next=null;
    }
}