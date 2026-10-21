// tree m comparison kese krtey h 
// //do alag alagr tree h unmey compare ese hi kre ge ??if (p.val==q.val&&p.left==q.left&&p.right==q.right){
//             return true;
//         }

// else if (p.val==q.val&&p.left.val==q.left.val&&p.right.val==q.right.val){
//             return true;
//         }
        
//         else if(p==null&&q!=null||p!=null&&q==null){
//             return false;
//         }
//         // else return false;








/**
 * Definition for a binary tree node.

 //tree node ek class h 
 hmey objet banane h 
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){return true;}
        if(p==null||q==null){return false;}
        if(p.val!=q.val){return false;}

        //else return(TreeNode(p.val))
         return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        
        
    }
}