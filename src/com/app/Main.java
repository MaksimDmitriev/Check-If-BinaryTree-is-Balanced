package com.app;

public class Main {

    public static void main(String[] args) {
        Solution.TreeNode root = new Solution.TreeNode(1);
        root.left = new Solution.TreeNode(2);
        root.right = new Solution.TreeNode(3);
        root.left.left = new Solution.TreeNode(4);
        root.left.right = new Solution.TreeNode(5);

        root.left.left.left = new Solution.TreeNode(7);

        root.right.right = new Solution.TreeNode(6);
        root.right.right.right = new Solution.TreeNode(8);

        Solution solution = new Solution();
        System.out.println(solution.isBalanced(root));
    }
}
