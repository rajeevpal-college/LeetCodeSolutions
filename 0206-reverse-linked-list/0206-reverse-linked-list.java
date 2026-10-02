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



 //ListNode=class k name h jo linked list k node ka
 //                         structure define krta h  or custom data type 

 //reverseList =function /method name hai jiskey andar code likhey ge
 //                                                jisey reverse hogi ll

//keywords=public class int

//multiple class can exit in OOPL ,class-diff role 1ListNode class 
//listnode class structur 
//solution bigger class 


//previous current anur next 1aage ka rasta shave kro
//2arror reverse kro 3peechey wale ko aage badhao
//4current ko aage badhao
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode next,curr, prev;
        prev=null;
        curr=head;


        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;

   
    }
}