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
    public int findBottomLeftValue(TreeNode root) {
        if(root == null)
            return 0;
        int res = 0;
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        while(q.size() > 0) {
            int size = q.size();
            res = q.peek().val;
            for(int i=0;i<size;i++) {
                TreeNode node = q.poll();
                if(node.left!=null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
        }
        return res;
    }
}