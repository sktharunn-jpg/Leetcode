// Last updated: 28/08/2026, 14:13:07
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        int res = nums[0] + nums[1] + nums[2];
6
7        for(int i=0;i<n-2;i++) {
8            int l = i+1, r = n-1;
9            while(l<r) {
10                int s = nums[i] + nums[l] + nums[r];
11                if(Math.abs(target-s) < Math.abs(target-res)) {
12                    res = s;
13                }
14
15                if(s==target) {
16                    return s;
17                } else if(s < target) {
18                    l++;
19                } else {
20                    r--;
21                }
22            }
23        }
24        return res;
25    }
26}