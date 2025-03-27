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
        HashSet<ListNode> h1=new HashSet<>();
        while(p1!=null)
        {
            h1.add(p1);
            p1=p1.next;
        }
        while(p2!=null)
        {
            if(h1.contains(p2))
            {
                return p2;
            }
            p2=p2.next;
        }
       return null; 
    }
}