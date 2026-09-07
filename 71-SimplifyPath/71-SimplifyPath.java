// Last updated: 07/09/2026, 14:43:23
1class Solution {
2    public String simplifyPath(String path) {
3        Stack<String> stack = new Stack<>();
4
5        String[] arr = path.split("/");
6
7        for (String s : arr) {
8
9            if (s.equals("") || s.equals(".")) {
10                continue;
11            }
12
13            if (s.equals("..")) {
14                if (!stack.isEmpty()) {
15                    stack.pop();
16                }
17            } 
18            else {
19                stack.push(s);
20            }
21        }
22        String result = "";
23        for (String s : stack) {
24            result += "/" + s;
25        }
26        if (result.equals("")) {
27            return "/";
28        }
29        return result;
30    }
31}