class Solution {
    public ListNode reverseList(ListNode head) {
        if ((head == null) || (head.next == null)){
            return head;
        }

        ListNode prev = null;
        ListNode curr = null;
        ListNode ahead = head;

        while (ahead != null) {
            curr = ahead;
            ahead = ahead.next;
            curr.next = prev;
            prev = curr;
        }
        return curr;
     }
}
