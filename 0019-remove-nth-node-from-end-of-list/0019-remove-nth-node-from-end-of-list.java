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


 //  pointer jarur bne g , jo nth h usmey n-1th ka adress n+1 ka dale g aur n ko free kr dengey 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy= new ListNode(0,head);
        ListNode fast ,slow;
        fast=dummy;
        slow =dummy;
       // fast=slow+n; fast ko n step aage k liye loop lage gi not direct 
        for (int i=0;i<=n;i++){
            fast=fast.next;
        }

        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;

        return dummy.next;

        
    }
}