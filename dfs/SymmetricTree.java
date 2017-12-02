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
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric_tree(root);
    }
    
    public boolean isSymmetric_tree(TreeNode root) {
        return isMirror(root,root);
    }
    
    public boolean isMirror(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 ==null)
            return true;
        
        if(root1 != null && root2 != null && root1.val == root2.val)
            return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
        else
            return false;
    } 
}