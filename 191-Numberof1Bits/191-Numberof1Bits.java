// Last updated: 02/09/2026, 12:39:18
1public class Solution {
2    public int hammingWeight(int n) {
3        int res = 0;
4        for (int i = 0; i < 32; i++) {
5            if (((n >> i) & 1) == 1) {
6                res += 1;
7            }
8        }
9        return res;       
10    }
11}