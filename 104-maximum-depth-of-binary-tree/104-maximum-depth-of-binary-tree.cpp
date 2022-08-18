/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int maxDepth(TreeNode* root) {
        return maxDepthHelper(root);
    }
private:
    int maxDepthHelper(TreeNode* root){
        if(root == nullptr ) return 0;
        int leftHeight = maxDepthHelper(root->left);
        int rightHeight = maxDepthHelper(root->right);
        int height = max(leftHeight, rightHeight);
        return height + 1;
    }
};