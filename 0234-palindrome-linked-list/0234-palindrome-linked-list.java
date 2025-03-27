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
    public static ListNode findMid(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
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
    public boolean isPalindrome(ListNode head) 
    {
        ListNode temp=head;
        if(temp==null || temp.next==null)
        {
            return true;
        }
        ListNode mid=findMid(temp);
        ListNode sh=mid.next;
        ListNode revsh=rev(sh);
        while(revsh!=null)
        {
            if(head.val!=revsh.val)
            {
                return false;
            }
            revsh=revsh.next;
            head=head.next;
        }
        return true;
    }
}