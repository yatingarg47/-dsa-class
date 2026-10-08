class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode d = new ListNode(0, head), p = d, q = d;
        while (n-- > 0) q = q.next;
        while (q.next != null) {
            p = p.next;
            q = q.next;
        }
        p.next = p.next.next;
        return d.next;
    }
}
