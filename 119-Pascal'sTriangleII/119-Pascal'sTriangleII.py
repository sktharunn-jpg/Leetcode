# Last updated: 02/09/2026, 09:31:33
1class Solution(object):
2    def getRow(self, rowIndex):
3        row = [1]
4
5        for _ in range(rowIndex):
6            row = [left + right for left, right in zip([0]+row, row+[0])]
7            
8        return row    