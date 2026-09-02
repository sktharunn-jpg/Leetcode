// Last updated: 02/09/2026, 14:22:44
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int d = m - 1;
4        int r = n - 1;
5        int k = Math.min(d, r);
6
7        long result = 1;
8
9        // Calculate the combination using the smaller value.
10        for (int i = 1; i <= k; i++) {
11            result = result * (d + r - k + i) / i;
12        }
13
14        return (int) result;
15    }
16}