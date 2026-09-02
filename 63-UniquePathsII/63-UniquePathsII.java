// Last updated: 02/09/2026, 14:21:51
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3
4        int m = obstacleGrid.length;
5        int n = obstacleGrid[0].length;
6
7        if (obstacleGrid[0][0] == 1) {
8            return 0;
9        }
10
11        int[][] dp = new int[m + 1][n + 1];
12
13        dp[1][1] = 1;
14
15        for(int i=1; i<=m; i++) {
16            for(int j=1; j<=n; j++) {
17
18                if(obstacleGrid[i-1][j-1] == 1) {
19                    dp[i][j] = 0;
20                    continue;
21                }
22
23                if(i == 1 && j == 1) {
24                    continue;
25                }
26
27                dp[i][j] = dp[i-1][j] + dp[i][j-1];
28
29            }
30        }
31
32        return dp[m][n];
33    }
34}