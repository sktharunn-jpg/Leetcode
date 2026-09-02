// Last updated: 02/09/2026, 14:06:24
1class Solution {
2    public List<Integer> preorderTraversal(TreeNode root) {
3
4        List<Integer> list = new ArrayList<>();
5        preorder(root, list);
6        return list;
7    }
8
9    public void preorder(TreeNode root, List<Integer> list) {
10
11        if(root == null) {
12            return;
13        }
14
15        list.add(root.val);
16        preorder(root.left, list);
17        preorder(root.right, list);
18    }
19}