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
    boolean res = false;
    public boolean hasPathSum(TreeNode root, int sum) {
      if(root == null)
        return res;
      getpathsum(root,sum, 0);
      return res;
    }
    
    public boolean getpathsum(TreeNode root,int sum, int cur_sum) {    
      if(root.left == null && root.right == null) {
        cur_sum += root.val;
        //System.out.println(root.val);
        if(cur_sum == sum) {
          //System.out.println(cur_sum);
          res = true;
        }
      }
      cur_sum += root.val;
      if(root.left != null) {
        getpathsum(root.left,sum,cur_sum);
      }
      if(root.right != null) {
        getpathsum(root.right,sum,cur_sum);
      }
      return res;
    }  
}