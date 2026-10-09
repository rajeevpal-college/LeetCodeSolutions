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
    public ListNode mergeKLists(ListNode[] lists) {
        // Edge case: Agar lists array khali hai
        if (lists == null || lists.length == 0) {
            return null;
        }

        // Min-Heap banayenge jo ListNode ki values ke basis par sort karega
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Step 1: Har list ka pehla node (head) heap mein daal do
        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }

        // Ek dummy node banayenge taaki nayi list easily build kar sakein
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        // Step 2: Jab tak heap khali na ho, sabse chhota element nikaalo
        while (!pq.isEmpty()) {
            ListNode curr = pq.poll(); // Sabse chhota node nikala
            tail.next = curr;          // Apni answer list mein joda
            tail = tail.next;          // Tail ko aage badhaya

            // Agar nikale gaye node ka agla element exist karta hai, toh use heap mein daal do
            if (curr.next != null) {
                pq.add(curr.next);
            }
        }

        // Dummy ka next humari actual sorted list ka head hoga
        return dummy.next;
    }
}