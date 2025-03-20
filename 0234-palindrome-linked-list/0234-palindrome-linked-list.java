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
    public boolean isPalindrome(ListNode head) 
    {
        List<Integer> l=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            l.add(temp.val);
            temp=temp.next;
        }
        int n=l.size();
        int m=n/2;
        
            for(int i=0;i<m;i++)
            {
                if(l.get(i)!=l.get(n-i-1))
                {
                    return false;
                }
            }
                return true;
    }
}