// height function kese create kre g binary tree k liye
//method ke andar method Function ke andar function likh saktey h ??
//complete function  checkHeight(node){}
// galti in maths.max(lh,rh)+1;
//how TreeNode is DataType /class
// height difference nikal k balanced ka logic 
//height nikalna and difference wale function m kese call kre g isBalanced function m ??


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
    public boolean isBalanced(TreeNode root) {
        
        return checkHeight(root)!=-1;

    }

       private int  checkHeight(TreeNode node){
            //base case
            if(node==null) return 0;

           int lh=checkHeight(node.left);
           if(lh==-1) return -1;

           
           int rh=checkHeight(node.right);
           if(rh==-1) return -1;

        

            if(Math.abs(lh-rh)>1){
                return -1;
            }
            else return Math.max(lh,rh)+1;

        
        }
        
    
}

// 2alag alag class use kre g methods function ko banane ko
//6 height difference nikal k balanced ka logic likhney m : checkHeight function k andar hi difference kre g 
// like height difference =|lh-rh|
// height difference = Math.abs(lh-rh) 
// esa kuch ya checkHeight function k bahar diffference nikale g 


// base case aur recursive leap
// hr ek node ki left right height ka diff 1 se jydad nhi 
// |height(left)- height(right)<=1


// bryte force
// height function jo left aur right ki height nikale
// agar inka difference 1 se bada to false return 
// recursive left recursive right 
// hr node p ja k uske nichey ki height baar baar control kro



// height function kese create kre g binary tree k liye

// height(){

// }
//  recursion use kre g check kre g bar bar ki TreeNode ka left or right !=null h to height++

//  ese hi recursion krtey jaye g ??

//  tree recursion function

//  lh=height(root.left)
//  rh=height(root.right) //height function ko bar bar call
//  return math.max(lh,rh)+1
// alag se height variable banane is tough thats why we use math.max(lh,rh)+1


// checkHeight(node){
//     node==null return 0;//base case

//     lh=checkHeight(node.left);

//     rh=checkHeight(node.right);

//     maths.max(lh,rh)+1;//height calculate 
// }

// upar wala recursion m wait krta h jab tak nichey m base case hit nhi hota tab taq recursion hota h fir base case hit hone pr upar ko values pass hoti h 
