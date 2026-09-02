// Last updated: 02/09/2026, 10:20:58
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) {
9 *         this.val = val;
10 *         this.next = next;
11 *     }
12 * }
13 */
14class Solution {
15    public ListNode removeNthFromEnd(ListNode head, int n) {
16
17        ListNode dummy = new ListNode(0);
18        dummy.next = head;
19
20        ListNode slow = dummy;
21        ListNode fast = dummy;
22
23        // Move fast n steps ahead
24        for (int i = 0; i < n; i++) {
25            fast = fast.next;
26        }
27
28        // Move both pointers
29        while (fast.next != null) {
30            slow = slow.next;
31            fast = fast.next;
32        }
33
34        // Remove nth node from the end
35        slow.next = slow.next.next;
36
37        return dummy.next;
38    }
39}