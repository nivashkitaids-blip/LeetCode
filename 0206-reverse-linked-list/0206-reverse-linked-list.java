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
/**class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode prev = null;
        ListNode curr = head;
        ListNode after = head.next;
        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = after;

            if (after != null)
                after = after.next;
        }
        return prev;

    }
}
*/
class Solution {
    public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
        return head;
    }

    // Reverse remaining list
    ListNode newHead = reverseList(head.next);

    // Change direction
    head.next.next = head;

    
    head.next = null;

    return newHead;
    }
}