/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        ListNode p1=headA;
        ListNode p2=headB;
        boolean found=false;
        while(p1!=null)
        {
            p2=headB;
            while(p2!=null)
            {
                if(p1==p2)
                {
                    found=true;
                    return p1;
                }
                else
                {
                    p2=p2.next;
                }
            }
            p1=p1.next;
        }
        return null;
    }
}