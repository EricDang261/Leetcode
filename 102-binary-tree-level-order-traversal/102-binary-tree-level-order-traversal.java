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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        res.add(Arrays.asList(root.val));
        while(!qu.isEmpty()){
            List<Integer> ls = new ArrayList<>();
            int size = qu.size();
            for(int i = 0 ; i < size; i++){
                TreeNode curr = qu.poll(); 
                if(curr.left != null){
                    qu.add(curr.left);
                    ls.add(curr.left.val);
                }
                
                if(curr.right!= null){
                    qu.add(curr.right);
                    ls.add(curr.right.val);
                }
            }
            res.add(ls);
            res.removeIf(p -> p.isEmpty());
        }
        return res;
    }
}