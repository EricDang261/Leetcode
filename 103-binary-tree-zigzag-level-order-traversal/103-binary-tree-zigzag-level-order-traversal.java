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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) 
            return new ArrayList<List<Integer>>();
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<TreeNode> node_queue = new LinkedList<>();
        
        node_queue.addLast(root);
        node_queue.addLast(null);
        
        LinkedList<Integer> level_list = new LinkedList<>();
        boolean is_order_left = true;
        
        while(!node_queue.isEmpty()){
            // retrieve and remove the 1st elemenent in the list 
            TreeNode curr_node = node_queue.pollFirst(); 
            if(curr_node != null){
                if(is_order_left){
                    level_list.addLast(curr_node.val);
                }else{
                    level_list.addFirst(curr_node.val);
                }
                
                if(curr_node.left != null){
                    node_queue.addLast(curr_node.left);
                }
                if(curr_node.right != null){
                    node_queue.addLast(curr_node.right);
                }
            }else{
                res.add(level_list);
                level_list = new LinkedList<Integer>();
                if(node_queue.size() > 0) node_queue.addLast(null);
                is_order_left = !is_order_left;
            }
        }
        return res;
    }
}