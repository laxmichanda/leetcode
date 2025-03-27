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
       Stack<ListNode> s1=new Stack<>();
       Stack<ListNode> s2=new Stack<>();
       while(p1!=null)
       {
        s1.push(p1);
        p1=p1.next;
       }
       while(p2!=null)
       {
        s2.push(p2);
        p2=p2.next;
       }
       ListNode lp=null;
       while(!s1.isEmpty() && !s2.isEmpty())
       {
        if(s1.peek()!=s2.peek())
        {
            return lp;
        }
        else
        {
            lp=s1.peek();
            s1.pop();
            s2.pop();
        }
       }
        return lp;
    }
}