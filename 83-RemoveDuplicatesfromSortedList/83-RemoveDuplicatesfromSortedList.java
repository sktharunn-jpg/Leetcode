// Last updated: 28/08/2026, 14:16:07
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        ListNode res = head;
4
5        while (head != null && head.next != null) {
6            if (head.val == head.next.val) {
7                head.next = head.next.next;
8            } else {
9                head = head.next;
10            }
11        }
12
13        return res;        
14    }
15}