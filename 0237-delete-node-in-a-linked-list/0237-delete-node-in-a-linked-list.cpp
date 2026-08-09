/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    void deleteNode(ListNode* node) {
        // Step 1: Copy the value from the next node into the current node
        node->val = node->next->val;
        
        // Step 2: Store the next node in a temporary variable so we can delete it from memory
        ListNode* nodeToDelete = node->next;
        
        // Step 3: Update the current node's next pointer to bypass the next node
        node->next = node->next->next;
        
        // Step 4: Free the memory of the bypassed node (good practice in C++)
        delete nodeToDelete;
    }
};