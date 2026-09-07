// Last updated: 07/09/2026, 14:54:03
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        return n>0 && (n&(n-1))==0;
4    }
5}