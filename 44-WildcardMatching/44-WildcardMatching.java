// Last updated: 02/09/2026, 13:34:53
1class Solution {
2    public boolean isMatch(String s, String p) {
3        int n=s.length();
4        int m=p.length();
5        int i=0;
6        int j=0;
7        int match=0;
8        int idx=-1;
9        while(i<n){
10            if(j<m&&(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?')){
11                   i++;
12                   j++;
13            }
14            else if(j<m&&p.charAt(j)=='*'){
15                match=i;
16                idx=j;
17                j++;
18            }
19            else if(idx!=-1){
20                 j=idx+1;
21                 match++;
22                 i=match;
23
24            }
25            else return false;
26        }
27        while(j<p.length()&&p.charAt(j)=='*') j++;
28        return j==p.length();
29    }
30}