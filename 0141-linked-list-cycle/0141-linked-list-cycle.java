/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) 
    {
        List<ListNode> l=new ArrayList<>();
        boolean found=false;
        ListNode p=head;
        while(!found && p!=null)
        {
            if(l.contains(p))
            {
                found=true;
            }
            else
            {
                l.add(p);
                p=p.next;
            }
        }
        return found;
    }
}