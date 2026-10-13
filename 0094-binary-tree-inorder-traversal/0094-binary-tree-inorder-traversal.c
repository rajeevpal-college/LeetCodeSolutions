/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* inorderTraversal(struct TreeNode* root, int* returnSize) {
    // Allocate memory for the result array (max 100 nodes per constraints)
    int* result = (int*)malloc(100 * sizeof(int));
    *returnSize = 0;
    
    // Create a stack to hold TreeNode pointers
    struct TreeNode** stack = (struct TreeNode**)malloc(100 * sizeof(struct TreeNode*));
    int top = -1; // Stack pointer
    
    struct TreeNode* curr = root;
    
    // Run until we've processed all nodes (curr is NULL AND stack is empty)
    while (curr != NULL || top != -1) {
        
        // Step 1: Reach the left-most node of the current node
        while (curr != NULL) {
            stack[++top] = curr; // Push current node to stack
            curr = curr->left;
        }
        
        // Step 2: Current is NULL, so we pop from the stack
        curr = stack[top--];
        
        // Add the popped node's value to our result (Visit Node)
        result[*returnSize] = curr->val;
        (*returnSize)++;
        
        // Step 3: Visit the right subtree
        curr = curr->right;
    }
    
    free(stack); // Clean up the memory used for the stack
    return result;
}