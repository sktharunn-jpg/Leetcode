// Last updated: 02/09/2026, 12:08:03
1class Solution
2{
3    public String multiply(String num1, String num2)
4    {
5        if (num1.equals("0") || num2.equals("0"))
6            return "0";
7
8        int n1 = num1.length(), n2 = num2.length();
9        int[] result = new int[n1 + n2];
10
11        for (int i = n1 - 1; i >= 0; i--)
12        {
13            for (int j = n2 - 1; j >= 0; j--)
14            {
15                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
16                int p1 = i + j, p2 = i + j + 1;
17                int sum = mul + result[p2];
18
19                result[p2] = sum % 10;
20                result[p1] += sum / 10;
21            }
22        }
23
24        StringBuilder prodstring = new StringBuilder();
25        for (int digit : result)
26        {
27            if (!(prodstring.length() == 0 && digit == 0))
28                prodstring.append(digit);
29        }
30
31        return prodstring.toString();
32    }
33}