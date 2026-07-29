class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // Base case: if list is empty or left equals right, no reversal needed
        if (head == null || left == right) {
            return head;
        }

        // Step 1: Create a dummy node to handle edge cases easily (e.g., left = 1)
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Step 2: Reach the node right before the 'left' position
        ListNode prev = dummy;
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        // 'curr' will point to the first node of the sublist to be reversed
        ListNode curr = prev.next;

        // Step 3: Reverse the sublist between 'left' and 'right' in-place
        for (int i = 0; i < right - left; i++) {
            ListNode nextNode = curr.next;
            curr.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
        }

        return dummy.next;
    }
}