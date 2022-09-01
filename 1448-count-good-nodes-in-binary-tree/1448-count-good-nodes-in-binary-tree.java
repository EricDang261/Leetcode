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
    private int numberOfGoodNodes = 0;
    
    public int goodNodes(TreeNode root) {
        goodNodes_DFS_helper(root, Integer.MIN_VALUE);
        return numberOfGoodNodes;
    }
    
    private void goodNodes_DFS_helper(TreeNode current, int maxSofar){
        // base case
        if(maxSofar <= current.val ) 
            numberOfGoodNodes+=1;
        
        if(current.left != null)
            goodNodes_DFS_helper(current.left, Math.max(maxSofar, current.val));
        
        if(current.right != null)
            goodNodes_DFS_helper(current.right, Math.max(maxSofar, current.val));
    }
    
    
}