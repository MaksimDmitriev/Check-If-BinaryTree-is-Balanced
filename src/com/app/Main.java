package com.app;

public class Main {

    public static void main(String[] args) {
        Solution.TreeNode root = new Solution.TreeNode(1);
        root.left = new Solution.TreeNode(2);
        root.right = new Solution.TreeNode(2);
        root.left.left = new Solution.TreeNode(3);
        root.left.right = new Solution.TreeNode(3);

        root.left.left.left = new Solution.TreeNode(4);
        root.left.left.right = new Solution.TreeNode(4);

        Solution solution = new Solution();
        System.out.println(solution.isBalanced(root));
    }
}
