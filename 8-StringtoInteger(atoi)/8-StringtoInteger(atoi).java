// Last updated: 01/09/2026, 10:34:26
1class Solution {
2    public int myAtoi(String s) {
3        if (s == null || s.length() == 0) {
4            return 0;
5        }        
6        final int INT_MAX = Integer.MAX_VALUE;
7        final int INT_MIN = Integer.MIN_VALUE;
8        int i = 0;
9        int n = s.length();        
10        while (i < n && s.charAt(i) == ' ') {
11            i++;
12        }        
13        if (i == n) {
14            return 0;
15        }        
16        int sign = 1;
17        if (s.charAt(i) == '+') {
18            i++;
19        } else if (s.charAt(i) == '-') {
20            sign = -1;
21            i++;
22        }        
23        long res = 0;
24        while (i < n && Character.isDigit(s.charAt(i))) {
25            int digit = s.charAt(i) - '0';
26            res = res * 10 + digit;           
27            if (sign * res <= INT_MIN) {
28                return INT_MIN;
29            }
30            if (sign * res >= INT_MAX) {
31                return INT_MAX;
32            }
33            i++;
34        }        
35        return (int)(res * sign);        
36    }
37}