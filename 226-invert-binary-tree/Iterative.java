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
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<> ();
        
        if(root == null) return null; // if it is null
        qu.add(root);
        
        // stop when queue is empty
        while(!qu.isEmpty()){
            // pop the queue and manipulate the node
            TreeNode tmp = qu.poll();// should get node (4)
            
            // swap its children 
            TreeNode swap = tmp.left;
            tmp.left = tmp.right;
            tmp.right = swap;
            
            // add back to the queue after swapping
            if(tmp.left != null) qu.add(tmp.left);
            if(tmp.right != null) qu.add(tmp.right);
            
        }
        return root;
    }
}

// time complexity: O(n)
// space complexity: O(n) // queue that hold of the nodes
