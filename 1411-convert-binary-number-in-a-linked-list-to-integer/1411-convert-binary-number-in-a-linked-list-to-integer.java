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
    public int getDecimalValue(ListNode head) 
    {
        ListNode temp=head;
        int s=0;
        while(temp!=null)
        {
            s++;
            temp=temp.next;
        }    
        int ans=0;
        temp=head;
        while(s>0)
        {
            if(temp.val==1)
            {
                ans=ans+(1<<(s-1));
            }
            s--;
            temp=temp.next;
        }
        return ans;
    }
}