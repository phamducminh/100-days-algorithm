// https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/625/
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
    public boolean valid(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }
        
        int val = node.val;
        
        if (min != null && val <= min) {
            return false;
        }
        if (max != null && val >= max) {
            return false;
        }
        
        return valid(node.left, min, val) && valid(node.right, val, max);
    }
    
    public boolean isValidBST(TreeNode root) {
        return valid(root, null, null);
    }
}