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
    bool isSymmetric(TreeNode* root) {
        return isSymmertricHelper(root, root);
    }
private:
    bool isSymmertricHelper(TreeNode* leftBranch, TreeNode* rightBranch){
        if(leftBranch == nullptr && rightBranch == nullptr) return true;
        if(leftBranch == nullptr || rightBranch == nullptr) return false ;
        
        return (leftBranch->val == rightBranch->val) &&
                isSymmertricHelper(leftBranch->left, rightBranch->right) &&
                isSymmertricHelper(leftBranch->right, rightBranch->left);
    }
};