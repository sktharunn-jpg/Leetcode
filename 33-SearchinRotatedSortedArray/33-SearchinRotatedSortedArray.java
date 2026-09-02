// Last updated: 02/09/2026, 13:24:35
1class Solution {
2    public int search(int[] nums, int target) {
3        int low = 0;
4        int high = nums.length - 1;
5
6        while(low <= high) {
7            int mid = low + (high - low) / 2;
8
9            if(nums[mid] == target) {
10                return mid;
11            }
12
13            // left half is sorted
14            if(nums[low] <= nums[mid]) {
15
16                if(nums[low] <= target &&
17                   target < nums[mid]) {
18                    high = mid - 1;
19                }
20                else {
21                    low = mid + 1;
22                }
23            }
24
25            // right half is sorted
26            else {
27
28                if(nums[mid] < target &&
29                   target <= nums[high]) {
30                    low = mid + 1;
31                }
32                else {
33                    high = mid - 1;
34                }
35            }
36        }
37
38        return -1;
39    }
40}