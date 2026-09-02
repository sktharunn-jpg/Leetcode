// Last updated: 02/09/2026, 11:17:36
1class Solution {
2    public ListNode reverseKGroup(ListNode head, int k) {
3        if (head == null) return null;
4
5        ListNode tail = head;
6        for (int i = 0; i < k; i++) {
7            if (tail == null) return head;
8            tail = tail.next;
9        }
10
11        ListNode newHead = reverse(head, tail);
12        head.next = reverseKGroup(tail, k);
13        return newHead;
14    }
15
16    private ListNode reverse(ListNode cur, ListNode end) {
17        ListNode prev = null;
18        while (cur != end) {
19            ListNode next = cur.next;
20            cur.next = prev;
21            prev = cur;
22            cur = next;
23        }
24        return prev;
25    }
26}