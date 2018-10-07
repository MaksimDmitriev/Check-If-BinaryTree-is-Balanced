package com.app;

public class Solution {

    boolean keepChecking;

    public boolean isBalanced(TreeNode root) {
        keepChecking = true;
        checkHeight(root);
        return keepChecking;
    }

    int checkHeight(TreeNode root) {
        if (root == null) {
            return -1;
        }

        int left = 1 + checkHeight(root.left);
        if (!keepChecking) {
            return 0;
        }
        int right = 1 + checkHeight(root.right);
        if (!keepChecking) {
            return 0;
        }
        keepChecking = (Math.abs(left - right) <= 1);
        return Math.max(left, right);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
