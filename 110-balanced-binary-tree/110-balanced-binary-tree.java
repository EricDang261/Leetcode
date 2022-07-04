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
    public boolean isBalanced(TreeNode root) {
        if(root == null ) return true; // empty input
        
        int left_height = find_tree_depth(root.left);
        int right_height = find_tree_depth(root.right);
        
        if(Math.abs(left_height - right_height) > 1) return false;
        
        return isBalanced(root.left) && isBalanced(root.right); // keep going down the tree
    }
    
    public int find_tree_depth(TreeNode root){
         // we need base cases to terminate the recursion
        if(root == null) return 0;
        
        int left_height = find_tree_depth(root.left);
        int right_height = find_tree_depth(root.right);
       
        return left_height < right_height ? right_height + 1 : left_height + 1;
    }
}