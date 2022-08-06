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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pVal = p.val;
        int qVal = q.val;
        int parentVal = root.val;
        
        if(pVal < parentVal && qVal < parentVal){ // on the left sub tree
            return lowestCommonAncestor(root.left, p, q);
        }else if(pVal > parentVal && qVal > parentVal){ // on the right sub tree
               return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}