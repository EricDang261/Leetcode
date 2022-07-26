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
    TreeNode ans = null;
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        recurseTree(root, p, q);
        return ans;
    }
    
    public boolean recurseTree(TreeNode root, TreeNode p , TreeNode q){
        if(root == null) return false;
        int l = recurseTree(root.left, p , q) ? 1: 0;
        int r = recurseTree(root.right, p, q) ? 1: 0;
        int mid = (root == p || root == q) ? 1:0;
        if(l + r + mid >= 2) 
            this.ans = root;
        return  l + r + mid > 0 ? true:false;
        
    }
}