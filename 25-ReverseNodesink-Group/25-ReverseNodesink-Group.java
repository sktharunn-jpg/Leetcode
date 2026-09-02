// Last updated: 02/09/2026, 11:19:49
1class Solution {
2    public ListNode reverseKGroup(ListNode head, int k) {
3
4        ListNode temp = head;
5
6        // Check if k nodes are available
7        for (int i = 0; i < k; i++) {
8            if (temp == null)
9                return head;
10            temp = temp.next;
11        }
12
13        // Reverse k nodes
14        ListNode prev = null;
15        ListNode curr = head;
16
17        for (int i = 0; i < k; i++) {
18            ListNode next = curr.next;
19            curr.next = prev;
20            prev = curr;
21            curr = next;
22        }
23
24        // Connect with the remaining list
25        head.next = reverseKGroup(curr, k);
26
27        return prev;
28    }
29}