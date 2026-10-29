// hr element of linked list m last se 2ki power 0 ,1 ,2 ,3 ,4 ,5;
// pichey se traversal kre g ya fir 
// length pta kr lo kitni h uske hisab se start 2 power n multiply kr lo
// object ka name this ,h na na ki head ya ListNode?? ya fir getDecimalValue
//power function like 2power i krna to 2pow(i) pow(2,i)??
// how to find length of linked list
// for(int i=n;i>1;i--) why it is wrong


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

    // ListNode decimal=0; wyu galat h ??

    //recursion
class Solution {
    public int getDecimalValue(ListNode head) {
       return solve(head,0);
    }
    public int solve(ListNode head, int decimal){
        if (head==null){
        return decimal;}
    

   return solve(head.next, (decimal*2)+head.val);

}
}




// class Solution {
//     public int getDecimalValue(ListNode head) {
//         int decimal=0;
//        while(head!=null){
//         decimal=(decimal*2)+head.val;
//         head=head.next;
//        }
//        return decimal;
//     }
// }

// class Solution {
//     public int getDecimalValue(ListNode head) {
//         int n=0;
//         ListNode temp=head;
//         while (temp!=null){
//             n++;
//             temp=temp.next;
//         }
//         int decimal=0,i=n-1; //n-1 kyu:0 1 2 not 123


//        while(head!=null){


//         decimal+= head.val*(int)Math.pow(2,i);
//         i--;

//         head=head.next;
//        }
//        return decimal;
//     }
// }


// class Solution {
//     public int getDecimalValue(ListNode head) {
//         // int n=this.size();

//         //linked list ki length  , without java.utility
//         int n=0;
//         ListNode temp =head; //listnode class data type
//         while(temp!=null){
//             n++;
//             temp=temp.next; 
//         }
//         temp=head;
//         int decimal=0;
//         for(int i=n-1;i>=0;i--){ //what wrong with i>1;
        
//         decimal+= temp.val*(int)Math.pow(2,i);

//         temp=temp.next;

//         }
//         return decimal;

//     }
//     }


//6 linked list ki length k liye name.size();
// head: object reference variable name h 
// Listnode:class data type 
// getDecimalValue:function method name
// this:current class ke object ko point krta heg solution class k object

// name.size java.utility.linkedlist me rehta h 

// double pointer to int (int) maths.pow(2,1)