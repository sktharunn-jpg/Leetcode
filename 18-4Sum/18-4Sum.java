// Last updated: 02/09/2026, 10:18:24
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        List<List<Integer>> ans = new ArrayList<>();
4
5        int n = nums.length;
6        Arrays.sort(nums);
7
8        for (int i = 0; i < n - 3; i++) {
9            // Skip duplicate first elements
10            if (i > 0 && nums[i] == nums[i - 1])
11                continue;
12            for (int j = i + 1; j < n - 2; j++) {
13                // Skip duplicate second elements
14                if (j > i + 1 && nums[j] == nums[j - 1])
15                    continue;
16                int start = j + 1;
17                int end = n - 1;
18                while (start < end) {
19                    long sum = (long) nums[i]+nums[j]+nums[start]+nums[end];
20
21                    if (sum == target) {
22                        ans.add(Arrays.asList(nums[i],nums[j],nums[start],nums[end]));
23
24                        start++;
25                        end--;
26                        // Skip duplicate elements
27                        while (start < end && nums[start] == nums[start - 1]) 
28                            start++;
29                        // Skip duplicate elements
30                        while (start < end && nums[end] == nums[end + 1]) 
31                            end--;
32                    } else if (sum < target) {
33                        start++;
34                    } else {
35                        end--;
36                    }
37                }
38            }
39        }
40        return ans;
41    }
42}