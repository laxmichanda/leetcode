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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        if(list1==null)
        {
            return list2;
        }
        if(list2==null)
        {
            return list1;
        }
        ListNode p1=list1;
        ListNode p2=list2;
        ListNode dum=new ListNode(-1);
        ListNode ans=dum;
        while(p1!=null && p2!=null)
        {
            if(p1.val<p2.val)
            {
                dum.next=new ListNode(p1.val);
                p1=p1.next;
                dum=dum.next;
                
            }
            else
            {
                dum.next=new ListNode(p2.val);
                p2=p2.next;
                dum=dum.next;
            }
        }
        while(p1!=null)
        {
             dum.next=new ListNode(p1.val);
                p1=p1.next;
                dum=dum.next;
        }
        while(p2!=null)
        {
                dum.next=new ListNode(p2.val);
                p2=p2.next;
                dum=dum.next;
        }

        return ans.next;
    }
}