class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> a = new ArrayList<>();
        while (head != null) {
            a.add(head.val);
            head = head.next;
        }
        int i = 0, j = a.size() - 1;
        while (i < j)
            if (!a.get(i++).equals(a.get(j--))) return false;
        return true;
    }
}
