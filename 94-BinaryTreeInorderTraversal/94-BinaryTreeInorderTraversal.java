// Last updated: 28/08/2026, 14:17:33
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> inorderTraversal(TreeNode root) {
18        List<Integer> res = new ArrayList<>();
19
20        inorder(root, res);
21        return res;        
22    }
23    private void inorder(TreeNode node, List<Integer> res) {
24        if (node == null) {
25            return;
26        }
27        inorder(node.left, res);
28        res.add(node.val);
29        inorder(node.right, res);
30    }    
31}