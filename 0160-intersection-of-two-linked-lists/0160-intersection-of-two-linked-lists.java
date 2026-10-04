/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 //question:A B ,return node intersect 
 //Listnode class/data type h ??? kya h ?>>>>>class blueprint val next 


//  Solution ek class h 

//  2 argument le rhey h getintnode m

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//intution  input ki interection val hi return 

ListNode pA,pB;
pA=headA;
pB=headB;
while(pA!=pB){

   if(pA==null){ pA=headB;}
   else pA=pA.next;
   if(pB==null){pB=headA;} 
   else pB=pB.next;
}
return pA;
        
        
    }
}