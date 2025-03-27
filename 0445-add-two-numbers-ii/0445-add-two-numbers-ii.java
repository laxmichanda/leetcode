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
        public static ListNode rev(ListNode head)
    {
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null)
        {
            ListNode nn=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nn;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode r1=rev(l1);
        ListNode r2=rev(l2);
        int sum=0;
        int c=0;
        ListNode dummy=new ListNode(-1);
        ListNode ans=dummy;
        while(r1!=null || r2!=null)
        {
            sum=r1==null?0:r1.val;
            sum+=r2==null?0:r2.val;
            sum+=c;
            c=sum/10;
            dummy.next=new ListNode(sum%10);
            dummy=dummy.next;
            if(r1!=null)
            {
                r1=r1.next;
            }
            if(r2!=null)
            {
                r2=r2.next;
            }
        }
        if(c!=0)
        {
            dummy.next=new ListNode(c);
            dummy=dummy.next;
            dummy=null;
        }
        return rev(ans.next);
    }
}