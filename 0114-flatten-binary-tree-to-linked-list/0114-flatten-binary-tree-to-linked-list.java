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
//  morries traversal 
//  1curr pointer root se start kro 
//  2check if left child exist
//  3if  left exist =to uske subtree ka akhiri node dhundo(right)
//  4us extreme right node ke right pointer ko curr node ke right childe se jod do 
//  5current node ke poore left part ko uthake right me shoift kar do, left null
//  6fir curr =curr.righ
class Solution {
    public void flatten(TreeNode root) {
        TreeNode curr = root;
        
        while (curr != null) {
            if (curr.left != null) {
                // Left subtree ka sabse rightmost node dhundo
                TreeNode prev = curr.left;
                while (prev.right != null) {
                    prev = prev.right;
                }
                
                // Rightmost node ke right ko current ke right se connect karo
                prev.right = curr.right;
                
                // Left subtree ko right mein shift karo aur left ko null kardo
                curr.right = curr.left;
                curr.left = null;
            }
            
            // Agle right node par jao
            curr = curr.right;
        }
        
    }
}

