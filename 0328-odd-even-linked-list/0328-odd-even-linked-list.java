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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Dummy nodes for odd and even position lists
        ListNode dummyOdd = new ListNode(-1);
        ListNode dummyEven = new ListNode(-1);

        // Pointers to build the lists
        ListNode odd = dummyOdd;
        ListNode even = dummyEven;

        ListNode temp = head;
        boolean isOdd = true; // First node is at index 1 (odd)

        while (temp != null) {
            if (isOdd) {
                odd.next = temp;
                odd = odd.next;
            } else {
                even.next = temp;
                even = even.next;
            }
            isOdd = !isOdd; // Toggle between odd and even
            temp = temp.next;
        }

        // Connect end of odd list to head of even list
        odd.next = dummyEven.next;

        // Terminate the even list to avoid cycles
        even.next = null;

        return dummyOdd.next;
    }
}