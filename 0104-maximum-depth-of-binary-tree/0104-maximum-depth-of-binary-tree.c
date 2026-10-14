// struct node c m , class java cpp m ÷


/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int maxDepth(struct TreeNode* root) {
    if(root==NULL){
        return 0;
    }
    int LD=maxDepth(root->left);
    int RD=maxDepth(root->right);

    if(LD>RD){
    return LD+1;
    }else{
        return RD+1;
    }
    
}