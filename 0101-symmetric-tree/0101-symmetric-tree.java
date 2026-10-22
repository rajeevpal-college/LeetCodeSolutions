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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }

        return isMirror(root.left,root.right);
    }
    private boolean isMirror(TreeNode leftNode, TreeNode rightNode){
        if(leftNode==null &&rightNode==null){
            return true;
        }
        if(leftNode==null||rightNode==null){
            return false;
        }

        return (leftNode.val==rightNode.val)
        && isMirror(leftNode.left,rightNode.right)
        && isMirror(leftNode.right,rightNode.left);
    }


        
    }




// agar root null h to tree symmetric h 
// 2helper function banayege jusmey left aur right subtree bheje g
// helper function check kre ga ki dono nood ek dusre k mirror h ki nhi
// agar dono node null h to symmetric h
// agar dodno m se koi ek null hai to ye symmetric nahi h

// 3 cheje check kre g 
// 1 dodno node ki value same
// 2pehle wale ka left dusrey wale ka right hona chaiye 
// 3pehley wale ka right dusrey ka left
// ek function banae g ,jismey left aur right rhey g 