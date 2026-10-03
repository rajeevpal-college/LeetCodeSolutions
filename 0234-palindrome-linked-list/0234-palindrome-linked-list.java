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
    public boolean isPalindrome(ListNode head) {
        if(head== null|| head.next==null){
            return true;
        }

//ll ka middle nikalo
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next!= null&& fast.next.next!= null){
            slow =slow.next;
            fast=fast.next.next;
        }
// reverse second half
        ListNode secondHalfHead= reverseList(slow.next);  
//3 compare first and second half
        ListNode p1 = head;
        ListNode p2 = secondHalfHead;

       while (p2 != null) {
            if (p1.val != p2.val) {
                return false; 
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return true; 
    }

    // Helper function to reverse a linked list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
        }               
    }
