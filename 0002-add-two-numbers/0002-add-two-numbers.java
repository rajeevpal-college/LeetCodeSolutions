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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //dummy node 
        ListNode dummy =new ListNode(0);
        ListNode curr= dummy;
        int carry =0;

//loop runs until bots lists are empty and no carry is left
        while(l1!=null||l2!=null||carry!=0){
            int val1=(l1!=null)? l1.val:0;
            int val2=(l2!=null)? l2.val:0;

            int sum =val1 + val2 + carry;
            carry=sum/10;

           //add digit to result list

           curr.next=new ListNode(sum%10);
           curr=curr.next;

           //move next node 
           if(l1!=null)l1=l1.next;
           if(l2 !=null)l2=l2.next; 


        }
        //return actual head
        return dummy.next;

        // ListNode l1n,l1p,l2n,l2p;

        // s.val=l1.val+l2.val;
        
    }
}