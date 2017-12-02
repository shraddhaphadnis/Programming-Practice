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
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortToBST(nums,0,nums.length-1);
    }
    public TreeNode sortToBST(int[] nums, int low, int high) {
        if(low > high)
            return null;
        int mid = (low + high)/2;
        
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortToBST(nums,low,mid-1);
        root.right = sortToBST(nums,mid+1,high);
        
        return root;
        
    }
}