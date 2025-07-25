/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) 
    {
        // Queue<Integer> h=new ArrayList<>();
        // if(root!=null)
        // {
        //     h.offer(root.val);
        // }
        // TreeNode temp=root;
        // while(temp!=null)
        // {
        //     if(temp.left==null)
        //     {
        //         h.offer(1000);
        //     }
        //     if(temp.right==null)
        //     {
        //         h.offer(1000);
        //     }
        //     if(temp.left!=null && temp.right!=null)
        //     {
                
        //     }
            
        // }
            return isMirror(root.left,root.right);

    }
    static boolean isMirror(TreeNode n1, TreeNode n2)
    {
        if(n1==null && n2==null)
        {
            return true;
        }
        if(n1==null || n2==null)
        {
            return false;
        }
        return (n1.val==n2.val) && isMirror(n1.left,n2.right) && isMirror(n1.right,n2.left);
    }
}