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
    int d; // diameter is the length of leftPath + rightPath
    public int diameterOfBinaryTree(TreeNode root) {
        d = 0;
        logestPath(root);
        return d;
    }
    
    private int logestPath(TreeNode root){
        if(root == null) return 0;
        int leftPath = logestPath(root.left);
        int rightPath = logestPath(root.right);
        
        // update the diameter
        d = Math.max(d, leftPath + rightPath);
        // return the longer path between left and right path
        return Math.max(leftPath, rightPath) + 1;
    }
}