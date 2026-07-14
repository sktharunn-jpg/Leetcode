// Last updated: 14/07/2026, 10:05:00
class Solution {
    public int missingNumber(int[] num) {
        int res=num.length;
        for (int i=0;i<num.length;i++){
            res += i-num[i];
        }
        return  res;
    }
}