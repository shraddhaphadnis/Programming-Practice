/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    boolean depth = true;
    public boolean isBalanced(TreeNode root) {
        treedepth(root);
        return depth;
    }
    
    public int treedepth(TreeNode root) {
        if(root == null)
            return 0;
        int left =  treedepth(root.left);
        int right = treedepth(root.right);
        int maxdiff = Math.abs(left - right);
        System.out.println(maxdiff);
        if(maxdiff > 1) {
            depth = false;
            return -1;
        }
        else
          return Math.max(left,right) + 1;
    }
}