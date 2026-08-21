// Last updated: 21/08/2026, 16:24:22
1class Solution {
2    public int reverse(int x) {
3        long finalNum = 0;
4        while(x!=0){
5            int lastDig = x%10;
6            finalNum += lastDig;
7            finalNum = finalNum*10;
8            x= x/10;
9        }
10        finalNum = finalNum/10;
11        if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
12            return 0;
13        }
14        if(x<0){
15            return (int)(-1*finalNum);
16        }
17        return (int)finalNum;
18    }
19}