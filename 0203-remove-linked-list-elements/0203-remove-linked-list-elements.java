class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node that points to the head of the list
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode curr = dummy;
        
        // Traverse the list
        while (curr.next != null) {
            if (curr.next.val == val) {
                // Skip the node with the target value
                curr.next = curr.next.next;
            } else {
                // Move to the next node
                curr = curr.next;
            }
        }
        
        // Return the actual head of the modified list
        return dummy.next;
    }
}